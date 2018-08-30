package com.example.demo.thread.chapter5.chapter_5_4;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/23.
 */
public class Task extends RecursiveTask<Integer> {
    private int[] array;
    private int start, end;

    public Task(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        System.out.printf("Task: Start From %d to %d.\n", start, end);
        Integer result = 0;
        if (end - start < 10) {
            if ((3 > start) && (3 < end)) {
                Exception e = new Exception("This task throws an Exception: "+ "Task from "+start+" to "+end);
                completeExceptionally(e);
//                throw new RuntimeException("This task throws an Exception: Task from " + start + " to " + end);
            }
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } else {
            int mid = (start + end) / 2;
            Task task1 = new Task(array, start, mid);
            Task task2 = new Task(array, mid, end);
            invokeAll(task1, task2);
            try {
                result = task1.get() + task2.get();
                System.out.printf("Task: Result from %d to %d: %d.\n", start, end, result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Task: End from %d to %d.\n", start, end);
        return result;
    }
}
