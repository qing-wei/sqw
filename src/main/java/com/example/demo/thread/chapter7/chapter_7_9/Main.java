package com.example.demo.thread.chapter7.chapter_7_9;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Main {
    public static void main(String[] args) {
        MyPriorityTransferQueue<Event> buffer = new MyPriorityTransferQueue<>();
        Producer producer = new Producer(buffer);
        Thread[] producerThreads = new Thread[10];
        for (int i = 0; i < producerThreads.length; i++) {
            producerThreads[i] = new Thread(producer);
            producerThreads[i].start();
        }

        Consumer consumer = new Consumer(buffer);
        Thread consumerThread = new Thread(consumer);
        consumerThread.start();

        System.out.printf("Main: Buffer: Consumer count: %d\n", buffer.getWaitingConsumerCount());

        Event myEvent = new Event("Core Event", 0);
        try {
            buffer.transfer(myEvent);
            System.out.printf("Main: My Event has been transfered.\n");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < producerThreads.length; i++) {
            try {
                producerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Buffer: Consumer count: %d.\n", buffer.getWaitingConsumerCount());
        myEvent = new Event("Core Event 2", 0);
        try {
            buffer.transfer(myEvent);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            consumerThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: End of the program.\n");
    }
}
