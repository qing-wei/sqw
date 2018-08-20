package com.example.demo.thread.chapter4.chapter_4_11;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class RejectedTaskController implements RejectedExecutionHandler {
    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.printf("RejectedTaskController: The task %s has been rejected.\n", r.toString());
        System.out.printf("RejectedTaskController: %s.\n", executor.toString());
        System.out.printf("RejectedTaskController: Terminating: %s.\n", executor.isTerminating());
        System.out.printf("RejectedTaskController: Terminated: %s.\n", executor.isTerminated());
    }
}
