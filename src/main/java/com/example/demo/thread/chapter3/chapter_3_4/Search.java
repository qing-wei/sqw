package com.example.demo.thread.chapter3.chapter_3_4;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Search implements Runnable {

    private int firstRow;
    private int lastRow;

    private MatrixMock matrixMock;
    private Results results;

    private int number;

    private final CyclicBarrier cyclicBarrier;

    public Search(int firstRow, int lastRow, MatrixMock matrixMock, Results results, int number, CyclicBarrier cyclicBarrier) {
        this.firstRow = firstRow;
        this.lastRow = lastRow;
        this.matrixMock = matrixMock;
        this.results = results;
        this.number = number;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.printf("%s : start to process rows from %d to %d.\n", Thread.currentThread().getName(), firstRow, lastRow);
        int counter;
        for (int i = firstRow; i < lastRow; i++) {
            counter = 0;
            int[] row = matrixMock.getRow(i);
            for (int j : row) {
                if (j == number) {
                    counter++;
                }
            }
            results.setData(i, counter);
        }

        System.out.printf("%s : From %d to %d has searched.\n", Thread.currentThread().getName(), firstRow, lastRow);

        try {
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}
