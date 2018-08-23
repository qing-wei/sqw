package com.example.demo.thread.chapter5.chapter_5_3;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/23.
 */
public class Main {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        FolderProcessor system = new FolderProcessor("C:\\Windows", "log");
        FolderProcessor apps = new FolderProcessor("C:\\Program Files", "log");
        FolderProcessor documents = new FolderProcessor("C:\\Program Files (x86)", "log");

        pool.execute(system);
        pool.execute(apps);
        pool.execute(documents);

        do {
            System.out.printf("************************************\n");
            System.out.printf("Main: Parallelism: %d.\n", pool.getParallelism());
            System.out.printf("Main: Active Threads: %d.\n", pool.getActiveThreadCount());
            System.out.printf("Main: Task Count: %d.\n", pool.getQueuedTaskCount());
            System.out.printf("Main: Steal Count: %d.\n", pool.getStealCount());
            System.out.printf("************************************\n");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while ((!system.isDone()) || (!apps.isDone()) || (!documents.isDone()));

        pool.shutdown();

        List<String> results;
        results = system.join();
        System.out.printf("System: %d files found.\n", results.size());
        results = apps.join();
        System.out.printf("Apps: %d files found.\n", results.size());
        results = documents.join();
        System.out.printf("Document: %d files found.\n", results.size());
    }
}
