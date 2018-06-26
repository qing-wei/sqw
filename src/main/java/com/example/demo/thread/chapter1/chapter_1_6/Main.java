package com.example.demo.thread.chapter1.chapter_1_6;

import java.util.Date;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class Main {
    public static void main(String[] args) {
        NetworkConnectionsLoader nsLoader = new NetworkConnectionsLoader();
        Thread nsThread = new Thread(nsLoader);

        DataSourceLoader dsLoader = new DataSourceLoader(nsThread);
        Thread dsThread = new Thread(dsLoader);

        dsThread.start();
        nsThread.start();

        try {
            System.out.println(new Date());
            dsThread.join();
            System.out.println(new Date());
            nsThread.join();
            System.out.println(new Date());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main is finished.");
    }
}
