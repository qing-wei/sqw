package com.example.demo.thread.chapter6.chapter_6_8;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by siqingwei on 2018/9/6.
 */
public class Incrementer implements Runnable {
    private AtomicIntegerArray vector;

    public Incrementer(AtomicIntegerArray vector) {
        this.vector = vector;
    }

    @Override
    public void run() {
        for (int i = 0; i < vector.length(); i++) {
            vector.getAndIncrement(i);
        }
    }
}
