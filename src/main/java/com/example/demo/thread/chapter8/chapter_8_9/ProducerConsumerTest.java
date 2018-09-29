package com.example.demo.thread.chapter8.chapter_8_9;

import edu.umd.cs.mtc.MultithreadedTestCase;
import org.junit.Assert;

import java.util.concurrent.LinkedTransferQueue;

/**
 * Created by siqingwei on 2018/9/29.
 */
public class ProducerConsumerTest extends MultithreadedTestCase {
    private LinkedTransferQueue<String> queue;

    @Override
    public void initialize() {
        super.initialize();
        queue = new LinkedTransferQueue<>();
        System.out.printf("Test: The test has been initialized.\n");
    }

    public void thread1() throws InterruptedException {
        String ret = queue.take();
        System.out.printf("Thread 1: %s\n", ret);
    }

    public void thread2() throws InterruptedException {
        waitForTick(1);
        String ret = queue.take();
        System.out.printf("Thread 2: %s\n", ret);
    }

    public void thread3() {
        waitForTick(1);
        waitForTick(2);
        queue.put("Event 1");
        queue.put("Event 2");
        System.out.printf("Thread 3: Inserted two elements.\n");
    }

    @Override
    public void finish(){
        super.finish();
        System.out.printf("Test: End\n");
        Assert.assertEquals(true, queue.size() == 0);
        System.out.printf("Test: Result: The queue is empty\n");
    }

}
