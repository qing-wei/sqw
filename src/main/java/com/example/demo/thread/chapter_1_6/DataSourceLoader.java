package com.example.demo.thread.chapter_1_6;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class DataSourceLoader implements Runnable {

    private Thread nsLoader;

    public DataSourceLoader(Thread nsLoader) {
        this.nsLoader = nsLoader;
    }

    @Override
    public void run() {
        System.out.printf("Beginning data source loading : %s\n", new Date());
        try {
            nsLoader.join();
            TimeUnit.SECONDS.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Ending data source loading : %s\n", new Date());
    }
}
