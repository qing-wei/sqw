package com.example.demo.thread.chapter7.chapter_7_3;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class MyTask implements Runnable {
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
