package com.example.demo.thread.chapter2.chapter_2_7;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Main {

    public static void main(String[] args) {
        FileMock fileMock = new FileMock(100, 20);
        Buffer buffer = new Buffer();

        Thread producer = new Thread(new Producer(fileMock, buffer), "Producer");
        Thread[] consumers = new Thread[3];

        for(int i = 0; i < 3; i++) {
            consumers[i] = new Thread(new Consumer(fileMock, buffer), "Consumer : " + i);
        }

        producer.start();
        for(int i = 0; i < 3; i++) {
            consumers[i].start();
        }
    }

}
