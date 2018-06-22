package com.example.demo.thread.chapter_1_1;

/**
 * Created by siqingwei on 2018/6/22.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 1; i < 10; i++) {
            Calculator calculator = new Calculator(i);
            Thread thread = new Thread(calculator);
            thread.start();
            thread.join();
        }
    }
}
