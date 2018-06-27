package com.example.demo.thread.chapter3.chapter_3_1;

import java.util.concurrent.Semaphore;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class PrintQueue {
    private Semaphore semaphore;

    public PrintQueue(){
        semaphore = new Semaphore(1);
    }

    public void printJob(Object document) {
        try {
            semaphore.acquire();

            int duration = (int) (Math.random() * 10000);
            System.out.printf("%s PrintQueue : printing a job during %d seconds.\n", Thread.currentThread().getName(), duration);
            Thread.sleep(duration);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + "----------------");
            semaphore.release();
        }
    }
}
