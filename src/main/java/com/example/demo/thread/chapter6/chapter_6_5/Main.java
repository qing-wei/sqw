package com.example.demo.thread.chapter6.chapter_6_5;

import java.util.Map;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Main {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, Contact> skipListMap = new ConcurrentSkipListMap();
        Thread[] threads = new Thread[25];
        int counter = 0;
        for (char i = 'A'; i < 'Z'; i++) {
            Task task = new Task(String.valueOf(i), skipListMap);
            threads[counter] = new Thread(task);
            threads[counter].start();
            counter++;
        }
        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Main: Size of the map: %d.\n", skipListMap.size());
        Map.Entry<String, Contact> entry = skipListMap.firstEntry();
        Contact contact = entry.getValue();
        System.out.printf("Main: First entry: name: %s, phone: %s.\n", contact.getName(), contact.getPhone());

        entry = skipListMap.lastEntry();
        contact = entry.getValue();
        System.out.printf("Main: Last entry: name: %s, phone: %s.\n", contact.getName(), contact.getPhone());

        System.out.printf("Submap from A1996 to B1002.\n");
        ConcurrentNavigableMap<String, Contact> submap = skipListMap.subMap("A1996", "B1002");
        do {
            entry = submap.pollFirstEntry();
            if (entry != null) {
                contact = entry.getValue();
                System.out.printf("Main: Entry: name: %s, phone: %s.\n", contact.getName(), contact.getPhone());
            }
        } while (entry != null);
    }
}
