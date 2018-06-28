package com.example.demo.thread.chapter3.chapter_3_3;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Participant implements Runnable {

    private VideoConference videoConference;

    private String name;

    public Participant(VideoConference videoConference, String name) {
        this.videoConference = videoConference;
        this.name = name;
    }

    @Override
    public void run() {

        int duration = (int) (Math.random() * 10);

        try {
            System.out.printf("Particpant : sleep %d seconds.\n", duration);
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        videoConference.arrive(name);

    }
}
