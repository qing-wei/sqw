package com.example.demo.thread.chapter3.chapter_3_7;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by siqingwei on 2018/6/29.
 */
public class Main {
    public static void main(String[] args) {

        List<String> buffer1 = new ArrayList<>(10);
        List<String> buffer2 = new ArrayList<>(10);

        Exchanger<List<String>> exchanger = new Exchanger<>();

        Producer producer = new Producer(buffer1, exchanger);
        Consumer consumer = new Consumer(buffer2, exchanger);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
