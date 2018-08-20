package com.example.demo.thread.chapter4.chapter_4_10;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class ReportGenerator implements Callable<String> {
    private String sender;
    private String title;

    public ReportGenerator(String sender, String title) {
        this.sender = sender;
        this.title = title;
    }

    @Override
    public String call() throws Exception {
        long duration = (long) (Math.random() * 10);
        System.out.printf("%s_%s: Generating report during %d seconds.\n", sender, title, duration);
        TimeUnit.SECONDS.sleep(duration);
        return sender + ": " + title;
    }
}
