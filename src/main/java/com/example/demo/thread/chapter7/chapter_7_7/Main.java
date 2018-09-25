package com.example.demo.thread.chapter7.chapter_7_7;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/25.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = new int[10000];
        Task task = new Task("Task", array, 0, array.length);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(task);
//        pool.execute(task);
//        task.join();
        pool.shutdown();

        System.out.printf("Main: End of the program.\n");
    }
}
