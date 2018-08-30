package com.example.demo.thread.chapter6.chapter_6_2;

import java.util.Date;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class Main {
    public static void main(String[] args) {
        LinkedBlockingDeque<String> requestList = new LinkedBlockingDeque<>(3);
        Client client = new Client(requestList);
        Thread thread = new Thread(client);
        thread.start();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                try {
                    String request = requestList.take();
                    System.out.printf("Main: Request: %s at %s. Size: %d.\n", request, new Date(), requestList.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            try {
                TimeUnit.MILLISECONDS.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Main: End of the program.");
    }
}
