package com.example.demo.thread.chapter6.chapter_6_8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * Created by siqingwei on 2018/9/6.
 */
public class Decrementer implements Runnable {
    private AtomicIntegerArray vecotr;

    public Decrementer(AtomicIntegerArray vecotr) {
        this.vecotr = vecotr;
    }

    @Override
    public void run() {
        for (int i = 0; i < vecotr.length(); i++) {
            vecotr.getAndDecrement(i);
        }
    }
}
