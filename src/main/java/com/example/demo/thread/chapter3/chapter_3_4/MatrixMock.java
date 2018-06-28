package com.example.demo.thread.chapter3.chapter_3_4;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class MatrixMock {
    private int data[][];

    public MatrixMock(int size, int length, int number) {
        int counter = 0;
        data = new int[size][length];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < length; j++) {
                int temp = (int) (Math.random() * 10);
                data[i][j] = temp;
                if (temp == number) {
                    counter++;
                }
            }
        }
        System.out.printf("The count of the number: %d in array is %d.\n", number, counter);
    }

    public int[] getRow(int row){
        if (row >= 0 && row < data.length) {
            return data[row];
        }
        return null;
    }

}
