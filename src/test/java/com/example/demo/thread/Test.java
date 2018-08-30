package com.example.demo.thread;

/**
 * Created by siqingwei on 2018/7/3.
 */
public class Test {
    public static void main(String[] args) {
//        long begin = System.currentTimeMillis();
//        for (int i = 0; i < 100000; i++) {
//            createOrderSn(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println((double)(begin-end)/100000);
//        System.out.println(System.currentTimeMillis());
        System.out.println(createOrderSn(88888888));
    }

    private static String createOrderSn(int i){
        return String.format("%07d",i) + System.currentTimeMillis();
    }
}
