package com.example.demo.thread.chapter4.chapter_4_7;

import java.util.Date;

/**
 * Created by siqingwei on 2018/8/15.
 */
public class Task implements Runnable {
    private String name;

    public Task(String name) {
        this.name = name;
    }

    @Override
    public void run()  {
        System.out.printf("%s : Starting at %s.\n", this.name, new Date());
    }
}
