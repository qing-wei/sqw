package com.example.demo.thread.chapter2.chapter_2_5;

import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class PriceInfo {
    private double price1;
    private double price2;
    private ReentrantReadWriteLock readWriteLock;

    public PriceInfo(){
        this.price1 = 1.0;
        this.price2 = 1.0;
        readWriteLock = new ReentrantReadWriteLock();
    }

    public double getPrice1(){
        readWriteLock.readLock().lock();
        double price = price1;
        readWriteLock.readLock().unlock();
        return price;
    }

    public double getPrice2(){
        readWriteLock.readLock().lock();
        double price = price2;
        readWriteLock.readLock().unlock();
        return price;
    }

    public void setPrice(double price1, double price2) {
        readWriteLock.writeLock().lock();
        this.price1 = price1;
        this.price2 = price2;
        readWriteLock.writeLock().unlock();
    }

}
