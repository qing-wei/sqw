package com.example.demo.thread.chapter4.chapter_4_10;

import java.util.concurrent.*;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class Main {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(executor);

        ReportRequest faceRequest = new ReportRequest("face", completionService);
        ReportRequest onlineRequest = new ReportRequest("online", completionService);

        Thread faceThread = new Thread(faceRequest);
        Thread onlineThread = new Thread(onlineRequest);

        ReportProcessor processor = new ReportProcessor(completionService);
        Thread senderThread = new Thread(processor);

        System.out.printf("Main: Starting the threads.\n");
        faceThread.start();
        onlineThread.start();
        senderThread.start();

        try {
            System.out.printf("Main: Waiting for the report generators.\n");
            faceThread.join();
            onlineThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Shutting down the Executor.\n");
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        processor.setEnd(true);
        System.out.printf("Main: Ends.\n");
    }
}
