package com.example.demo.thread.chapter_1_9;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class UnsafeTask implements Runnable {
    private Date startDate;
    @Override
    public void run() {
        startDate = new Date();
        System.out.printf("Thread starting: %s %s.\n", Thread.currentThread().getId(), startDate);
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread finished: %s %s.\n", Thread.currentThread().getId(), startDate);
    }
}
