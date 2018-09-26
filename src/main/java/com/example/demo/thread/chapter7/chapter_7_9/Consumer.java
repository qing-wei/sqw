package com.example.demo.thread.chapter7.chapter_7_9;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Consumer implements Runnable {
    private MyPriorityTransferQueue<Event> buffer;

    public Consumer(MyPriorityTransferQueue<Event> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1002; i++) {
            try {
                Event value= buffer.take();
                System.out.printf("Consumer: %s: %d.\n", value.getThread(), value.getPriority());
            } catch (InterruptedException e1) {
                e1.printStackTrace();
            }
        }
    }
}
