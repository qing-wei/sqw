package com.example.demo.thread.chapter4.chapter_4_7;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/15.
 */
public class Main {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);

        System.out.printf("Main : Starting at %s.\n", new Date());
        Task task = new Task("Task");

        ScheduledFuture<?> scheduledFuture = executorService.scheduleAtFixedRate(task, 1, 2, TimeUnit.SECONDS);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Main : Delay %d\n", scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
            try {
                TimeUnit.MILLISECONDS.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        executorService.shutdown();

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main : Finished at %s.\n", new Date());
    }
}
