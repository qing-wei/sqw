package com.example.demo.thread.chapter7.chapter_7_7;

/**
 * Created by siqingwei on 2018/9/25.
 */
public class Task extends MyWorkerTask {
    private int[] array;
    private int start, end;

    public Task(String name, int[] array, int start, int end) {
        super(name);
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected void compute() {
        if (start - end > 100) {
            int mid = (start + end) / 2;
            Task task1 = new Task(this.getName() + "1", array, start, mid);
            Task task2 = new Task(this.getName() + "1", array, mid, end);
            invokeAll(task1, task2);
        } else {
            for (int i = start; i < end; i++) {
                array[i]++;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
