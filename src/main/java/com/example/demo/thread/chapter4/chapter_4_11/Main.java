package com.example.demo.thread.chapter4.chapter_4_11;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();

        RejectedTaskController rejectedTaskController = new RejectedTaskController();
        executor.setRejectedExecutionHandler(rejectedTaskController);

        System.out.println("Main: Starting");
        for (int i = 0; i < 3; i++) {
            Task task = new Task("Task" + i);
            executor.submit(task);
        }

        System.out.println("Main: Shutting down the executor.");
        executor.shutdown();
        System.out.println("Main: Sending anothor task.");
        Task rejectedTask = new Task("RejectedTask");
        executor.submit(rejectedTask);
        System.out.println("Main: Ends.");
    }
}
