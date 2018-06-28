package com.example.demo.thread.chapter3.chapter_3_3;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Main {
    public static void main(String[] args) {
        VideoConference videoConference = new VideoConference(10);

        Thread conference = new Thread(videoConference, "Thread-Conference");
        conference.start();

        for (int i = 0; i < 10; i++) {
            Participant participant = new Participant(videoConference, "Participant " + i);
            new Thread(participant).start();
        }
    }
}
