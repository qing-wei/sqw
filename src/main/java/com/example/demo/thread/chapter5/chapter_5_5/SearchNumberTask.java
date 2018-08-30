package com.example.demo.thread.chapter5.chapter_5_5;

import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class SearchNumberTask extends RecursiveTask<Integer> {
    private int[] array;
    private int start, end;
    private int number;
    private TaskManager taskManager;
    private static final int NOTFOUND = -1;

    public SearchNumberTask(int[] array, int start, int end, int number, TaskManager taskManager) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.number = number;
        this.taskManager = taskManager;
    }

    @Override
    protected Integer compute() {
        System.out.printf("Task: %d to %d.\n", start, end);
        int ret;
        if (end - start > 10) {
            ret = launchTasks();
        } else {
            ret = lookForNumber();
        }
        return ret;
    }

    private int lookForNumber() {
        for (int i = start; i < end; i++) {
            if (array[i] == number) {
                System.out.printf("Task: Number %d found in position %d.\n", number, i);
                taskManager.cancelTask(this);
                return i;
            }
        }
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return NOTFOUND;
    }

    private int launchTasks() {
        int mid = (start + end) / 2;
        SearchNumberTask task1 = new SearchNumberTask(array, start, mid, number, taskManager);
        SearchNumberTask task2 = new SearchNumberTask(array, mid, end, number, taskManager);
        taskManager.addTask(task1);
        taskManager.addTask(task2);
        task1.fork();
        task2.fork();

        int ret = task1.join();
        if (ret != -1) {
            return ret;
        }
        ret = task2.join();
        return ret;
    }

    public void writeCancelMessage() {
        System.out.printf("Task: Cancel task from %d to %d.\n", start, end);
    }
}
