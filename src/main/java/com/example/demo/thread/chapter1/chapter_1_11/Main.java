package com.example.demo.thread.chapter1.chapter_1_11;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        MyThreadGroup myThreadGroup = new MyThreadGroup("MyThreadGroup");
        for (int i = 0; i < 2; i++) {
            Thread thread = new Thread(myThreadGroup, task);
            thread.start();
        }
    }
}
