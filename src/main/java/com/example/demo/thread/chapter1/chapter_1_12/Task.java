package com.example.demo.thread.chapter1.chapter_1_12;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Task implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
