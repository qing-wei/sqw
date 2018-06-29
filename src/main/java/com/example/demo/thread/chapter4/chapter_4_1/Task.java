package com.example.demo.thread.chapter4.chapter_4_1;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/29.
 */
public class Task implements Runnable {

    private Date initDate;
    private String name;

    public Task(Date initDate, String name) {
        this.initDate = initDate;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.printf("%s : Task : %s Created on %s.\n", Thread.currentThread().getName(), name, initDate);

        System.out.printf("%s : Task : %s start to excute on %s.\n", Thread.currentThread().getName(), name, new Date());

        int duration = (int) (Math.random() * 10);
        try {
            System.out.printf("%s : Task : %s doing a task during %s seconds.\n", Thread.currentThread().getName(), name, duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s : Task : %s has excuted on %s.\n", Thread.currentThread().getName(), name, new Date());
    }
}
