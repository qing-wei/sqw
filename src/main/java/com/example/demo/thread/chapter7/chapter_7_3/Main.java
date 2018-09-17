package com.example.demo.thread.chapter7.chapter_7_3;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThreadFactory myThreadFactory = new MyThreadFactory("myThreadFactory");
        MyTask myTask = new MyTask();
        Thread myThread = myThreadFactory.newThread(myTask);
        myThread.start();
        myThread.join();
        System.out.printf("Main: Thread information.\n");
        System.out.printf("%s.\n", myThread);
        System.out.printf("Main: End of the example.\n");
    }
}
