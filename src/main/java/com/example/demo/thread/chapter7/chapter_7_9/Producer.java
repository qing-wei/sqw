package com.example.demo.thread.chapter7.chapter_7_9;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Producer implements Runnable {
    private MyPriorityTransferQueue<Event> buffer;

    public Producer(MyPriorityTransferQueue<Event> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            buffer.put(new Event(Thread.currentThread().getName(), i));
        }
    }
}
