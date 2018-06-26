package com.example.demo.thread.chapter1.chapter_1_7;

import java.util.Date;
import java.util.Deque;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class CleanerTask extends Thread {

    private Deque<Event> deque;

    public CleanerTask(Deque<Event> deque) {
        setDaemon(true);
        this.deque = deque;
    }

    @Override
    public void run() {
        while (true) {
            clean(new Date());
        }
    }

    private void clean(Date date) {
        if (deque.size() == 0) {
            return;
        }

        long difference;
        boolean delete = false;

        do {
            Event event = deque.getLast();
            difference = date.getTime() - event.getDate().getTime();
            if (difference > 10000) {
                System.out.printf("Cleaner : %s\n", event.getEvent());
                deque.removeLast();
                delete = true;
            }
        } while (difference > 10000);

        if (delete) {
            System.out.printf("Cleaner : Size of the queue: %d\n", deque.size());
        }
    }
}
