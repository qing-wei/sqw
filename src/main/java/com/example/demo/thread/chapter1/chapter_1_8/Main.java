package com.example.demo.thread.chapter1.chapter_1_8;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.setUncaughtExceptionHandler(new ExceptionHandler());
        thread.start();
    }
}
