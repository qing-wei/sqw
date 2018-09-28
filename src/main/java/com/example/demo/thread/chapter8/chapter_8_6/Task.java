package com.example.demo.thread.chapter8.chapter_8_6;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by siqingwei on 2018/9/28.
 */
public class Task implements Runnable {
    ReentrantLock lock;

    public Task(ReentrantLock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            TimeUnit.SECONDS.sleep(1);
            lock.unlock();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static class Main {
        public static void main(String[] args) {
            ReentrantLock lock = new ReentrantLock();
            for (int i = 0; i < 10; i++) {
                Task task = new Task(lock);
                Thread thread = new Thread(task);
                thread.run();
            }
        }
    }
}
