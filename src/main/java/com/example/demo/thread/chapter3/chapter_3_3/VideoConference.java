package com.example.demo.thread.chapter3.chapter_3_3;

import java.util.concurrent.CountDownLatch;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class VideoConference implements Runnable {

    private CountDownLatch countDownLatch;

    public VideoConference(int number) {
        countDownLatch = new CountDownLatch(number);
    }

    public void arrive(String name) {
        System.out.printf("VideoConference : %s has arrived.\n", name);
        countDownLatch.countDown();
        System.out.printf("VideoConference : Waiting for %d participants.\n", countDownLatch.getCount());
    }

    @Override
    public void run() {
        System.out.printf("VideoConference : Initialization %d participants.\n", countDownLatch.getCount());
        try {
            countDownLatch.await();

            System.out.printf("VideoConference : All participants have come.\n");
            System.out.printf("VideoConference : Let's start...\n");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}