package com.example.demo.thread.chapter4.chapter_4_5;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/14.
 */
public class Task implements Callable<Result> {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public Result call() throws Exception {
        System.out.printf("%s : Task Starting.\n", this.name);
        long duration = (long) (Math.random() * 10);
        System.out.printf("%s : Waiting %d seconds for results.\n", this.name, duration);
        TimeUnit.SECONDS.sleep(duration);

        int value = 0;
        for (int i = 0; i < 5; i++) {
            value += (int) (Math.random() * 100);
        }
        Result result = new Result();
        result.setName(this.name);
        result.setValue(value);
        System.out.printf(this.name + ": Ends.\n");
        return result;
    }
}
