package com.example.demo.thread.chapter4.chapter_4_6;

import java.util.Date;
import java.util.concurrent.Callable;

/**
 * Created by siqingwei on 2018/8/15.
 */
public class Task implements Callable<String> {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("%s : Starting at %s.\n", name, new Date());
        return "Hello World!";
    }
}
