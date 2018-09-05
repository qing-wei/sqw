package com.example.demo.thread.chapter6.chapter_6_6;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Thread[] threads = new Thread[3];
        for (int i = 0; i < threads.length; i++) {
            TaskLocalRandom random = new TaskLocalRandom();
            threads[i] = new Thread(random);
            threads[i].start();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
