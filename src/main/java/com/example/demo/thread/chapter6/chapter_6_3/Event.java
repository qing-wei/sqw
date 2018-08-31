package com.example.demo.thread.chapter6.chapter_6_3;

/**
 * Created by siqingwei on 2018/8/31.
 */
public class Event implements Comparable<Event> {
    private int thread;
    private int priority;

    public Event(int thread, int priority) {
        this.thread = thread;
        this.priority = priority;
    }

    public int getThread() {
        return thread;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Event e) {
        if (this.priority > e.getPriority()) {
            return -1;
        } else if (this.priority < e.getPriority()) {
            return 1;
        }
        return 0;
    }
}
