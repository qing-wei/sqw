package com.example.demo.thread.chapter6.chapter_6_3;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by siqingwei on 2018/8/31.
 */
public class Main {
    public static void main(String[] args) {
        PriorityBlockingQueue<Event> queue = new PriorityBlockingQueue<>();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            Task task = new Task(i, queue);
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

        System.out.printf("Main: Queue size: %d.\n", queue.size());
        for (int i = 0; i < threads.length * 1000; i++) {
            Event event = queue.poll();
            System.out.printf("Thread: %d Priority: %d.\n", event.getThread(), event.getPriority());
        }
        System.out.printf("Main: Queue size: %d.\n", queue.size());
        System.out.println("Main: End of the program.");
    }
}