package com.example.demo.thread.chapter4.chapter_4_8;

import java.util.concurrent.*;

/**
 * Created by siqingwei on 2018/8/16.
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        Task task = new Task();
        System.out.println("Main : Executing the Task.");
        Future<String> future = executor.submit(task);

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main : Canceling the Task.");
        future.cancel(true);
        System.out.printf("Main : Canceled : %s.\n", future.isCancelled());
        System.out.printf("Main : Done : %s.\n", future.isDone());
//        try {
//            future.get();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }
        executor.shutdown();
        System.out.printf("Main : The Executor has finished.\n");
    }
}
