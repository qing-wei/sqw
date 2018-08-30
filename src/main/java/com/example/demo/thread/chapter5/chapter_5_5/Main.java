package com.example.demo.thread.chapter5.chapter_5_5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class Main {
    public static void main(String[] args) {
        int[] array = ArrayGenerator.generateArray(1000);
        TaskManager taskManager = new TaskManager();
        SearchNumberTask task = new SearchNumberTask(array, 0, 1000, 5, taskManager);
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(task);
        forkJoinPool.shutdown();

        try {
            forkJoinPool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main: The program has finished.\n");
    }
}
