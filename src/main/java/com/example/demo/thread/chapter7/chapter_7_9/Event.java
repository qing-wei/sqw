package com.example.demo.thread.chapter7.chapter_7_9;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Event implements Comparable<Event> {
    private String thread;
    private int priority;

    public Event(String thread, int priority) {
        this.thread = thread;
        this.priority = priority;
    }

    public String getThread() {
        return thread;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Event o) {
        if (this.priority > o.getPriority()) {
            return -1;
        } else if (this.priority < o.getPriority()) {
            return 1;
        }
        return 0;
    }
}
