package com.example.demo.thread.chapter6.chapter_6_4;

import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/31.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        DelayQueue<Event> queue = new DelayQueue<>();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            Task task = new Task(i + 1, queue);
            threads[i] = new Thread(task);
        }
        for (int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Main: Queue Size: %d.\n", queue.size());
        do {
            int counter = 0;
            Event event;
            do {
                event = queue.poll();
                if (event != null) {
                    counter++;
                }
            } while (event != null);
            System.out.printf("At %s you have read %d events.\n", new Date(), counter);
            TimeUnit.MILLISECONDS.sleep(500);
        } while (queue.size() > 0);
        System.out.printf("Main: Queue Size: %d.\n", queue.size());
    }
}
