package com.example.demo.thread.chapter_1_5;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class FileClockThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 10; i++) {

            System.out.printf("%s\n", new Date());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("The FileClock has been interrupted.");
                System.out.println(isInterrupted());
                return;
            }
        }
    }
}
