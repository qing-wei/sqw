package com.example.demo.thread.chapter7.chapter_7_1;

import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/12.
 */
public class SleepTwoSecondsTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        TimeUnit.SECONDS.sleep(2);
        return new Date().toString();
    }
}
