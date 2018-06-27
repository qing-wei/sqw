package com.example.demo.thread.chapter2.chapter_2_7;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Producer implements Runnable {
    private Buffer buffer;
    private FileMock fileMock;
    public Producer(FileMock fileMock, Buffer buffer) {
        this.fileMock = fileMock;
        this.buffer = buffer;
    }
    @Override
    public void run() {
        buffer.setPendingLines(true);
        while (fileMock.hasMoreLines()) {
            buffer.insert(fileMock.getLine());
        }
        buffer.setPendingLines(false);
    }
}
