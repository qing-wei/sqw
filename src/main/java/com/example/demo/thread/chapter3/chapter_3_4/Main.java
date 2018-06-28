package com.example.demo.thread.chapter3.chapter_3_4;

import java.util.concurrent.CyclicBarrier;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Main {
    public static void main(String[] args) {
        int size = 10000;
        int length = 1000;
        int number = 5;
        int page = 2000;
        int thread_count = 5;

        MatrixMock matrixMock = new MatrixMock(size, length, number);
        Results results = new Results(size);

        Grouper grouper = new Grouper(results);

        CyclicBarrier cyclicBarrier = new CyclicBarrier(thread_count, grouper);

        for (int i = 0; i < thread_count; i++) {
            Thread thread = new Thread(new Search(i * page, (i + 1) * page, matrixMock, results, number, cyclicBarrier));
            thread.start();
        }

        System.out.println("The main thread has finished.\n");
    }
}
