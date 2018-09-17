package com.example.demo.thread.chapter7.chapter_7_3;

import java.util.concurrent.ThreadFactory;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class MyThreadFactory implements ThreadFactory {
    private int counter;
    private String prefix;

    public MyThreadFactory(String prefix) {
        this.prefix = prefix;
        this.counter = 1;
    }

    @Override
    public Thread newThread(Runnable r) {
        MyThread myThread = new MyThread(r, prefix + "-" + counter);
        counter++;
        return myThread;
    }
}
