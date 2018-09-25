package com.example.demo.thread.chapter7.chapter_7_8;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/25.
 */
public class Task implements Runnable {
    private MyLock lock;
    private String name;

    public Task(MyLock lock, String name) {
        this.lock = lock;
        this.name = name;
    }

    @Override
    public void run() {
        lock.lock();
        System.out.printf("Task: %s: Take the lock.\n", name);
        try {
            TimeUnit.SECONDS.sleep(2);
            System.out.printf("Task: %s: Free the lock.\n", name);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}
