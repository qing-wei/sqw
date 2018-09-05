package com.example.demo.thread.chapter6.chapter_6_5;

import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Task implements Runnable {
    private String id;
    private ConcurrentSkipListMap<String, Contact> map;

    public Task(String id, ConcurrentSkipListMap<String, Contact> map) {
        this.id = id;
        this.map = map;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            Contact contact = new Contact(id, String.valueOf(i + 1000));
            map.put(id + contact.getPhone(), contact);
        }
    }
}
