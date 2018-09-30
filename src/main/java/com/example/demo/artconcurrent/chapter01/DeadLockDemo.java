package com.example.demo.artconcurrent.chapter01;

/**
 * Created by siqingwei on 2018/9/30.
 */
public class DeadLockDemo {
    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {
        new DeadLockDemo().deadLock();
    }

    private void deadLock() {
        Thread thread1 = new Thread(() -> {
            synchronized (A) {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (B) {
                    System.out.println("1");
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (B) {
                synchronized (A) {
                    System.out.println("2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
