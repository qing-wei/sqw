package com.example.demo.thread.chapter3.chapter_3_2;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class PrintQueue {
    private Semaphore semaphore;
    private boolean[] freePrinters;
    private ReentrantLock lock;

    public PrintQueue(){
        semaphore = new Semaphore(3);
        freePrinters = new boolean[3];
        for (int i = 0; i < 3; i++) {
            freePrinters[i] = true;
        }
        lock = new ReentrantLock();
    }

    public void printJob(Object document) {
        try {
            semaphore.acquire();

            int assignedPrinter = getPrinter();

            int duration = (int) (Math.random() * 10000);
            System.out.printf("%s PrintQueue : printing a job in printer %d during %d seconds.\n",
                    Thread.currentThread().getName(), assignedPrinter, duration);
            Thread.sleep(duration);

            freePrinters[assignedPrinter] = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(Thread.currentThread().getName() + "----------------");
            semaphore.release();
        }
    }

    public int getPrinter() {
        int ret = -1;
        lock.lock();
        try {
            for (int i = 0; i < freePrinters.length; i++) {
                if (freePrinters[i]) {
                    ret = i;
                    freePrinters[i] = false;
                    break;
                }
            }
        } finally {
            lock.unlock();
        }
        return ret;
    }
}
