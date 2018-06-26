package com.example.demo.thread.chapter1.chapter_1_3;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        PrimeGenerator primeGenerator = new PrimeGenerator();
        primeGenerator.start();

        Thread.sleep(5000);

        primeGenerator.interrupt();
    }
}
