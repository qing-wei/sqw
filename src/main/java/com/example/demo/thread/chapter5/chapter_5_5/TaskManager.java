package com.example.demo.thread.chapter5.chapter_5_5;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinTask;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class TaskManager {
    private List<ForkJoinTask<Integer>> tasks;

    public TaskManager() {
        this.tasks = new ArrayList<>();
    }

    public void addTask(ForkJoinTask<Integer> task){
        this.tasks.add(task);
    }
    public void cancelTask(ForkJoinTask<Integer> cancelTask) {
        for (ForkJoinTask<Integer> task : tasks) {
            if (task != cancelTask) {
                task.cancel(true);
                ((SearchNumberTask)(task)).writeCancelMessage();
            }
        }
    }
}
