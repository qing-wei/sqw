package com.example.demo.thread.chapter6.chapter_6_1;

import java.util.concurrent.ConcurrentLinkedDeque;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class PollTask implements Runnable {
    private ConcurrentLinkedDeque<String> deque;

    public PollTask(ConcurrentLinkedDeque<String> deque) {
        this.deque = deque;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5000; i++) {
            deque.pollFirst();
            deque.pollLast();
        }
    }
}
