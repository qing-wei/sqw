package com.example.demo.thread.chapter4.chapter_4_9;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/16.
 */
public class ExecutableTask implements Callable<String> {
    private String name;

    public ExecutableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        long duration = (long) (Math.random() * 10);
        System.out.printf("%s : Waiting %d seconds for results.\n", this.name, duration);
        TimeUnit.SECONDS.sleep(duration);
        return "Hello World, I am " + this.name;
    }

    public String getName() {
        return name;
    }
}
