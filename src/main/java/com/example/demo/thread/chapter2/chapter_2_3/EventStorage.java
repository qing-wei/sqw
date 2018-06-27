package com.example.demo.thread.chapter2.chapter_2_3;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class EventStorage {
    private int maxSize;
    private LinkedList<Date> storage;

    public EventStorage(){
        this.maxSize = 20;
        this.storage = new LinkedList<>();
    }

    public synchronized void set(){
        while (storage.size() == 20) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        storage.offer(new Date());
        System.out.printf("Set : %d\n", storage.size());
        notifyAll();
    }

    public synchronized void get(){
        while (storage.size() == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Get : %d %s\n", storage.size(), storage.poll());
        notifyAll();
    }
}
