package com.example.demo.thread.chapter7.chapter_7_8;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/25.
 */
public class Main {
    public static void main(String[] args) {
        MyLock myLock = new MyLock();
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new Task(myLock, "Task-" + i));
            thread.start();
        }
        boolean value;
        do {
            try {
                value = myLock.tryLock(1, TimeUnit.SECONDS);
                if (!value) {
                    System.out.printf("Main: Trying to get the lock.\n");
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                value = false;
            }
        } while (!value);
        System.out.printf("Main: Got the lock.\n");
        myLock.unlock();
        System.out.printf("Main: End of the program.\n");
    }
}
