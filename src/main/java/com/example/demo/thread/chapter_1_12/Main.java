package com.example.demo.thread.chapter_1_12;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Main {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory("myThreadFactory");
        Task task = new Task();
        for (int i = 0; i < 10; i++) {
            Thread thread = myThreadFactory.newThread(task);
            thread.start();
        }
        System.out.printf("Factory strList:\n");
        System.out.printf(myThreadFactory.getStrList());
    }
}
