package com.example.demo.thread.chapter_1_5;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class FileMain {
    public static void main(String[] args) throws InterruptedException {
//        FileClock fileClock = new FileClock();
//        Thread thread = new Thread(fileClock);
//        thread.start();
//
//        TimeUnit.SECONDS.sleep(5);
//
//        thread.interrupt();

        FileClockThread fileClockThread = new FileClockThread();
        fileClockThread.start();

        TimeUnit.SECONDS.sleep(5);

        fileClockThread.interrupt();
    }
}
