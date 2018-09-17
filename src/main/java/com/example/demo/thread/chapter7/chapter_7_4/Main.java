package com.example.demo.thread.chapter7.chapter_7_4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class Main {
    public static void main(String[] args) {
        MyThreadFactory myThreadFactory = new MyThreadFactory("MyThreadFactory");
        ExecutorService executorService = Executors.newCachedThreadPool(myThreadFactory);
        MyTask myTask = new MyTask();
        executorService.submit(myTask);
        executorService.shutdown();
        try {
            executorService.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Main: End of the program.\n");
    }
}
