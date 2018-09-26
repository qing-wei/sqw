package com.example.demo.thread.chapter7.chapter_7_10;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Senor1 implements Runnable {
    private ParkingCounter counter;

    public Senor1(ParkingCounter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carIn();
        counter.carOut();
        counter.carOut();
        counter.carOut();
        counter.carIn();
        counter.carIn();
        counter.carIn();
    }
}
