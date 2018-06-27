package com.example.demo.thread.chapter2.chapter_2_7;

import java.util.Random;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Consumer implements Runnable {

    private FileMock fileMock;
    private Buffer buffer;

    public Consumer(FileMock fileMock, Buffer buffer) {
        this.fileMock = fileMock;
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (buffer.hasPendingLines()) {
            processLine(buffer.get());
        }
    }

    private void processLine(String line) {
        try {
            Thread.sleep((int) (Math.random() * 100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
