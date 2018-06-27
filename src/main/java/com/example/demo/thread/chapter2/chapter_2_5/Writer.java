package com.example.demo.thread.chapter2.chapter_2_5;

import java.util.Random;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Writer implements Runnable {

    private PriceInfo priceInfo;

    public Writer(PriceInfo priceInfo) {
        this.priceInfo = priceInfo;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.printf("Writer : Attempt to modify price\n");
            priceInfo.setPrice(Math.random() * 10, Math.random() * 8);
            System.out.printf("Writer : prices have been modified.\n");
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
