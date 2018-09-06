package com.example.demo.thread.chapter6.chapter_6_8;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by siqingwei on 2018/9/6.
 */
public class Main {
    public static void main(String[] args) {
        AtomicIntegerArray vector = new AtomicIntegerArray(1000);
        Incrementer incrementer = new Incrementer(vector);
        Decrementer decrementer = new Decrementer(vector);

        int THREADS = 100;
        Thread[] incrementerThreads = new Thread[THREADS];
        Thread[] decrementerThreads = new Thread[THREADS];

        for (int i = 0; i < THREADS; i++) {
            incrementerThreads[i] = new Thread(incrementer);
            decrementerThreads[i] = new Thread(decrementer);

            incrementerThreads[i].start();
            decrementerThreads[i].start();
        }

        for (int i = 0; i < THREADS; i++) {
            try {
                incrementerThreads[i].join();
                decrementerThreads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        for (int i = 0; i < vector.length(); i++) {
            if (vector.get(i) != 0) {
                System.out.println("Vector[" + i + "]:" + vector.get(i));
            }
        }

        System.out.println("Main: End of the example.");
    }
}
