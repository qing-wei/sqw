package com.example.demo.thread.chapter2.chapter_2_5;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Main {
    public static void main(String[] args) {
        PriceInfo priceInfo = new PriceInfo();

        Thread[] readers = new Thread[5];
        for (int i = 0; i < 5; i++) {
            readers[i] = new Thread(new Reader(priceInfo));
        }

        Thread writer = new Thread(new Writer(priceInfo));
        for (int i = 0; i < 5; i++) {
            readers[i].start();
        }
        writer.start();
    }
}
