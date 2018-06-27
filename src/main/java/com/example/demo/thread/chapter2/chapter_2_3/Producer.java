package com.example.demo.thread.chapter2.chapter_2_3;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Producer implements Runnable {

    private EventStorage storage;
    public Producer(EventStorage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            storage.set();
        }
    }
}
