package com.example.demo.thread.chapter1.chapter_1_9;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class SafeTask implements Runnable {
    ThreadLocal<Date> startDate = new ThreadLocal<Date>(){
        @Override
        protected Date initialValue(){
            return new Date();
        }
    };
    @Override
    public void run() {
        System.out.printf("Thread starting: %s %s.\n", Thread.currentThread().getId(), startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread finished: %s %s.\n", Thread.currentThread().getId(), startDate.get());
    }
}
