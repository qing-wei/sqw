package com.example.demo.thread.chapter2.chapter_2_3;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Consumer implements Runnable {
    private EventStorage storage;
    public Consumer(EventStorage storage) {
        this.storage = storage;
    }
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.get();
        }
    }
}
