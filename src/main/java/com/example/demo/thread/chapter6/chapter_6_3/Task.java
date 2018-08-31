package com.example.demo.thread.chapter6.chapter_6_3;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by siqingwei on 2018/8/31.
 */
public class Task implements Runnable {
    private int id;
    private PriorityBlockingQueue<Event> queue;

    public Task(int id, PriorityBlockingQueue<Event> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Event event = new Event(id, i);
            queue.add(event);
        }
    }
}
