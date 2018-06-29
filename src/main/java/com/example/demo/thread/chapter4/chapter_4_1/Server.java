package com.example.demo.thread.chapter4.chapter_4_1;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by siqingwei on 2018/6/29.
 */
public class Server {
    private ThreadPoolExecutor executor;

    public Server() {
        executor = (ThreadPoolExecutor) Executors.newCachedThreadPool();
    }

    public void executeTask(Task task) {
        System.out.println("Server : A new task has arrived.");
        executor.execute(task);
        System.out.printf("Server : Pool Size : %d.\n", executor.getPoolSize());
        System.out.printf("Server : Active Count : %d.\n", executor.getActiveCount());
        System.out.printf("Server : Completed tasks : %d.\n", executor.getCompletedTaskCount());
    }

    public void endServer(){
        executor.shutdown();
    }
}
