package com.example.demo.thread.chapter8.chapter_8_1;

import java.util.Collection;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Task implements Runnable {
    private Lock lock;

    public Task(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            lock.lock();
            System.out.printf("%s: Get the lock.\n", Thread.currentThread().getName());
            try {
                TimeUnit.MILLISECONDS.sleep(500);
                System.out.printf("%s: Free the lock.\n", Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            Task task = new Task(myLock);
            threads[i] = new Thread(task);
            threads[i].start();
        }

        for (int i = 0; i < 15; i++) {
            System.out.printf("Main: Logging the Lock.\n");
            System.out.printf("*************************\n");
            System.out.printf("Lock: Owner : %s.\n", myLock.getOwnerName());

            System.out.printf("Lock: Queued Threads: %s.\n", myLock.hasQueuedThreads());
            if (myLock.hasQueuedThreads()) {
                System.out.printf("Lock: Queue Length: %d.\n", myLock.getQueueLength());
                System.out.printf("Lock: Queued Threads: ");
                Collection<Thread> lockedThreads = myLock.getThreads();
                for (Thread lockedThread : lockedThreads) {
                    System.out.printf("%s ", lockedThread.getName());
                }
                System.out.printf("\n");
            }
            System.out.printf("Lock: Fairness: %s.\n", myLock.isFair());
            System.out.printf("Lock: Locked: %s.\n", myLock.isLocked());
            System.out.printf("***********************.\n");

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
