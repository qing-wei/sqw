package com.example.demo.thread.chapter5.chapter_5_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/22.
 */
public class Main {
    public static void main(String[] args) {
        Document documentMock = new Document();
        String[][] document = documentMock.generateDocument(100, 1000, "the");
        DocumentTask documentTask = new DocumentTask(document, 0, 100, "the");
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        forkJoinPool.execute(documentTask);

        do {
            System.out.printf("************************************\n");
            System.out.printf("Main: Parallelism: %d.\n", forkJoinPool.getParallelism());
            System.out.printf("Main: Active Threads: %d.\n", forkJoinPool.getActiveThreadCount());
            System.out.printf("Main: Task Count: %d.\n", forkJoinPool.getQueuedTaskCount());
            System.out.printf("Main: Steal Count: %d.\n", forkJoinPool.getStealCount());
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!documentTask.isDone());

        forkJoinPool.shutdown();

        try {
            forkJoinPool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        try {
            System.out.printf("Main: The word appears %d in the document.\n", documentTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
