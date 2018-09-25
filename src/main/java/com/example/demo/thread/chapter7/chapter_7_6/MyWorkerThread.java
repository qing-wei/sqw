package com.example.demo.thread.chapter7.chapter_7_6;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinWorkerThread;

/**
 * Created by siqingwei on 2018/9/21.
 */
public class MyWorkerThread extends ForkJoinWorkerThread {
    private static ThreadLocal<Integer> taskCounter = new ThreadLocal<>();
    public MyWorkerThread(ForkJoinPool pool) {
        super(pool);
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.printf("MyWorkerThread %d: Initializing task counter.\n", getId());
        taskCounter.set(0);
    }

    @Override
    protected void onTermination(Throwable exception) {
        System.out.printf("MyWorkerThread %d: %d.\n", getId(), taskCounter.get());
        super.onTermination(exception);
    }

    public void addTask(){
        int counter = taskCounter.get().intValue();
        counter++;
        taskCounter.set(counter);
    }
}
