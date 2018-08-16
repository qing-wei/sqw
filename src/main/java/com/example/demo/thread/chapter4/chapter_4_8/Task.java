package com.example.demo.thread.chapter4.chapter_4_8;

import java.util.concurrent.Callable;

/**
 * Created by siqingwei on 2018/8/16.
 */
public class Task implements Callable<String> {
    @Override
    public String call() throws Exception {
        while (true) {
            System.out.println("Task Test.");
            Thread.sleep(100);
        }
    }
}
