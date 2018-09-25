package com.example.demo.thread.chapter7.chapter_7_7;

import java.util.concurrent.ForkJoinTask;

/**
 * Created by siqingwei on 2018/9/25.
 */
public abstract class MyWorkerTask extends ForkJoinTask<Void> {
    private String name;

    public MyWorkerTask(String name) {
        this.name = name;
    }

    @Override
    public Void getRawResult() {
        return null;
    }

    @Override
    protected void setRawResult(Void value) {

    }

    @Override
    protected boolean exec() {
        long startTime = System.currentTimeMillis();
        compute();
        long endTime = System.currentTimeMillis();
        long diff = endTime - startTime;
        System.out.printf("MyWorkerTask: %s : %d Milliseconds to compute.\n", name, diff);
        return true;
    }

    protected abstract void compute();

    public String getName() {
        return name;
    }
}
