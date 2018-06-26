package com.example.demo.thread.chapter_1_11;

import java.util.Random;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Task implements Runnable {
    @Override
    public void run() {
        Random random = new Random(Thread.currentThread().getId());
        int result;

        while (true) {
            result = 1000 / (int) (random.nextDouble() * 100);
            System.out.printf("%s : %d\n", Thread.currentThread().getId(), result);
            if (Thread.currentThread().isInterrupted()) {
                System.out.printf("%s : Interrupted\n", Thread.currentThread().getId());
                return;
            }
        }

    }
}
