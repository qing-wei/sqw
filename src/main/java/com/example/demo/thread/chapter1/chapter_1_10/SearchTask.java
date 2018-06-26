package com.example.demo.thread.chapter1.chapter_1_10;

import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class SearchTask implements Runnable {

    private Result result;

    public SearchTask(Result result){
        this.result = result;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.printf("Thread %s start.\n", name);
        try {
            doTask();
            result.setName(name);
        } catch (InterruptedException e) {
            System.out.printf("Thread %s interrupted.\n", name);
            return;
        }
        System.out.printf("Thread %s finished.\n", name);
    }

    private void doTask() throws InterruptedException {
        Random random = new Random(System.currentTimeMillis());
        int value = (int) (random.nextDouble() * 100);
        System.out.printf("Thread %s %d.\n", Thread.currentThread().getName(), value);
        TimeUnit.SECONDS.sleep(value);
    }
}
