package com.example.demo.thread.chapter_1_9;

import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Core {
    public static void main(String[] args) {
//        unsafeTask();
        safeTask();
    }

    private static void unsafeTask(){
        commonTask(new UnsafeTask());
    }

    private static void safeTask(){
        commonTask(new SafeTask());
    }

    private static void commonTask(Runnable runnable){
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(runnable);
            thread.start();

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
