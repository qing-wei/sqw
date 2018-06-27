package com.example.demo.thread.chapter2.chapter_2_3;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Main {
    public static void main(String[] args) {
        EventStorage eventStorage = new EventStorage();
        Thread producer = new Thread(new Producer(eventStorage));
        Thread consumer = new Thread(new Consumer(eventStorage));

        producer.start();
        consumer.start();
    }
}
