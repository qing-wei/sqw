package com.example.demo.thread.chapter3.chapter_3_4;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Grouper implements Runnable {

    private Results results;

    public Grouper(Results results){
        this.results = results;
    }

    @Override
    public void run() {
        System.out.println("Grouper: Processing results...");
        int totalCount = 0;
        for (int counter : results.getData()) {
            totalCount += counter;
        }
        System.out.printf("TotalCount : %d.\n", totalCount);
    }
}
