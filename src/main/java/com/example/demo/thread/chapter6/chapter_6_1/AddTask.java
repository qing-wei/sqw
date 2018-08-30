package com.example.demo.thread.chapter6.chapter_6_1;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class AddTask implements Runnable {
    private ConcurrentLinkedDeque<String> deque;

    public AddTask(ConcurrentLinkedDeque<String> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i < 10000; i++) {
            deque.add(name + ": Element" + i);
        }
    }
}
