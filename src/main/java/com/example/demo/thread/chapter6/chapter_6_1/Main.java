package com.example.demo.thread.chapter6.chapter_6_1;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class Main {
    public static void main(String[] args) {
        ConcurrentLinkedDeque<String> deque = new ConcurrentLinkedDeque<>();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            AddTask addTask = new AddTask(deque);
            threads[i] = new Thread(addTask);
            threads[i].start();
        }
        System.out.printf("Main: %d AddTask threads has been launched.\n", threads.length);
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Main: Size of the deque: %d.\n", deque.size());
        for (int i = 0; i < threads.length; i++) {
            PollTask pollTask = new PollTask(deque);
            threads[i] = new Thread(pollTask);
            threads[i].start();
        }
        System.out.printf("Main: %d PollTask threads has been launched.\n", threads.length);
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("Main: Size of the deque: %d.\n", deque.size());
    }
}
