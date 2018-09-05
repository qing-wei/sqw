package com.example.demo.thread.chapter6.chapter_6_6;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class TaskLocalRandom implements Runnable {
    public TaskLocalRandom() {
        ThreadLocalRandom.current();
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10; i++) {
            System.out.printf("%s: %d.\n", name, ThreadLocalRandom.current().nextInt(10));
        }
    }
}
