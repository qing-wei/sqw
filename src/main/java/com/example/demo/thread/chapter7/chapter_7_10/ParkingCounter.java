package com.example.demo.thread.chapter7.chapter_7_10;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class ParkingCounter extends AtomicInteger {
    private int maxNumber;

    public ParkingCounter(int maxNumber) {
        set(0);
        this.maxNumber = maxNumber;
    }

    public boolean carIn() {
        for (;;) {
            int value = get();
            if (value == maxNumber) {
                System.out.printf("ParkingCounter: The parking lot is full.\n");
                return false;
            } else {
                int newValue = value + 1;
                boolean changed = this.compareAndSet(value, newValue);
                if (changed) {
                    System.out.printf("ParkingCounter: A car has entered.\n");
                    return true;
                }
            }
        }
    }

    public boolean carOut(){
        for (;;) {
            int value = get();
            if (value == 0) {
                System.out.printf("ParkingCounter: The parking lot is empty.\n");
                return false;
            } else {
                int newValue = value - 1;
                boolean changed = this.compareAndSet(value, newValue);
                if (changed) {
                    System.out.printf("ParkingCounter: A car has gone out.\n");
                    return true;
                }
            }
        }
    }
}
