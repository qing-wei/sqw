package com.example.demo.thread.chapter4.chapter_4_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by siqingwei on 2018/8/14.
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        List<Task> taskList = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            taskList.add(new Task(String.valueOf(i)));
        }
        List<Future<Result>> futureList = null;
        try {
            futureList = executor.invokeAll(taskList);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdown();

        System.out.println("Main : Printing the Results");
        for (int i = 0; i < futureList.size(); i++) {
            Future<Result> resultFuture = futureList.get(i);
            try {
                Result result = resultFuture.get();
                System.out.println(result.getName() + " : " + result.getValue());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }
}
