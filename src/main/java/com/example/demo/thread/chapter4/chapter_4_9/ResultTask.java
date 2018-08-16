package com.example.demo.thread.chapter4.chapter_4_9;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by siqingwei on 2018/8/16.
 */
public class ResultTask extends FutureTask<String> {
    private String name;

    public ResultTask(Callable<String> callable) {
        super(callable);
        this.name = ((ExecutableTask) callable).getName();
    }

    @Override
    protected void done() {
        if (this.isCancelled()) {
            System.out.printf("%s : Has been canceled.\n", this.name);
        } else {
            System.out.printf("%s : Has finished.\n", this.name);
        }
    }
}
