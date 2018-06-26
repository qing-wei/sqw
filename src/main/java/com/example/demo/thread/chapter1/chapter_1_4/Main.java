package com.example.demo.thread.chapter1.chapter_1_4;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        FileSearch fileSearch = new FileSearch("D:\\", "TIM2.2.5.exe");
        Thread thread = new Thread(fileSearch);
        thread.start();

        TimeUnit.SECONDS.sleep(10);

        thread.interrupt();
    }
}
