package com.example.demo.thread.chapter3.chapter_3_4;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Results {
    private int[] data;

    public Results(int size){
        data = new int[size];
    }

    public void setData(int position, int value){
        data[position] = value;
    }

    public int[] getData(){
        return data;
    }
}
