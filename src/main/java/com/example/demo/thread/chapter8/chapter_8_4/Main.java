package com.example.demo.thread.chapter8.chapter_8_4;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/9/27.
 */
public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        int[] array = new int[10000];
        Task task1 = new Task(array, 0, array.length);
        pool.execute(task1);

        while (!task1.isDone()) {
            showLog(pool);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        pool.shutdown();

        try {
            pool.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        showLog(pool);
        System.out.printf("Main: End of the program.\n");
    }

    private static void showLog(ForkJoinPool pool) {
        System.out.printf("*****************************\n");
        System.out.printf("Main: Fork/Join Pool log.\n");
        System.out.printf("Main: Fork/Join Pool: Parallelism: %d.\n", pool.getParallelism());
        System.out.printf("Main: Fork/Join Pool: Pool Size: %d.\n", pool.getPoolSize());
        System.out.printf("Main: Fork/Join Pool: Active Thread Count: %d.\n", pool.getActiveThreadCount());
        System.out.printf("Main: Fork/Join Pool: Running Thread Count: %d.\n", pool.getRunningThreadCount());
        System.out.printf("Main: Fork/Join Pool: Queued Submission: %d.\n", pool.getQueuedSubmissionCount());
        System.out.printf("Main: Fork/Join Pool: Queued Tasks: %d.\n", pool.getQueuedTaskCount());
        System.out.printf("Main: Fork/Join Pool: Queued Submissions: %s.\n", pool.hasQueuedSubmissions());
        System.out.printf("Main: Fork/Join Pool: Steal Count: %d.\n", pool.getStealCount());
        System.out.printf("Main: Fork/Join Pool: Terminated: %s.\n", pool.isTerminated());
        System.out.printf("*****************************\n");
    }
}
