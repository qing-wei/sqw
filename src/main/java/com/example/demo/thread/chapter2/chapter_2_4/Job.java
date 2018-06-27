package com.example.demo.thread.chapter2.chapter_2_4;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Job implements Runnable {

    private PrintQueue printQueue;

    public Job(PrintQueue printQueue){
        this.printQueue = printQueue;
    }

    @Override
    public void run() {
        System.out.printf("%s : going to print a document.\n", Thread.currentThread().getName());
        printQueue.printJob(new Object());
        System.out.printf("%s : The document has been printed.\n", Thread.currentThread().getName());
    }
}
