package com.example.demo.thread.chapter4.chapter_4_2;

import java.util.Date;

/**
 * Created by siqingwei on 2018/6/29.
 */
public class Main {
    public static void main(String[] args) {
        Server server = new Server();
        for (int i = 0; i < 100; i++) {
            server.executeTask(new Task(new Date(), "Task " + i));
        }
        server.endServer();
    }
}
