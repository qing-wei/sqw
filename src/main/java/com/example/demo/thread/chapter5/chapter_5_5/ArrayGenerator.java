package com.example.demo.thread.chapter5.chapter_5_5;

import java.util.Random;

/**
 * Created by siqingwei on 2018/8/30.
 */
public class ArrayGenerator {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
