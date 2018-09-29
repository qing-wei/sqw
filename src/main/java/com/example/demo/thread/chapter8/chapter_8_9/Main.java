package com.example.demo.thread.chapter8.chapter_8_9;

import edu.umd.cs.mtc.TestFramework;

public class Main {
    public static void main(String[] args) {
        ProducerConsumerTest test = new ProducerConsumerTest();
        System.out.printf("Main: Starting the test.\n");
        try {
            TestFramework.runOnce(test);
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.printf("Main: The test has finished.\n");
    }
}