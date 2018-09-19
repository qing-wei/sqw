package com.example.demo.thread.chapter7.chapter_7_5;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class Task implements Runnable {
    @Override
    public void run() {
        System.out.printf("Task: Begin.\n");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Task: End.\n");
    }
}
