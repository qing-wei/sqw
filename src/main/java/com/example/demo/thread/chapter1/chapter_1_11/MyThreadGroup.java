package com.example.demo.thread.chapter1.chapter_1_11;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class MyThreadGroup extends ThreadGroup {
    public MyThreadGroup(String name) {
        super(name);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.printf("The thread %s has thrown an exception\n", t.getId());
        e.printStackTrace(System.out);
        System.out.printf("Terminating the rest of the threads\n");
        interrupt();
    }
}
