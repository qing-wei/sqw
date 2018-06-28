package com.example.demo.thread.chapter3.chapter_3_6;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Student implements Runnable {

    private MyPhaser myPhaser;

    public Student(MyPhaser myPhaser) {
        this.myPhaser = myPhaser;
    }

    @Override
    public void run() {
        System.out.printf("%s : Arrived at %s.\n", Thread.currentThread().getName(), new Date());
        myPhaser.arriveAndAwaitAdvance();

        System.out.printf("%s : is going to first exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        doExercise1();
        System.out.printf("%s : has done first exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        myPhaser.arriveAndAwaitAdvance();

        System.out.printf("%s : is going to second exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        doExercise2();
        System.out.printf("%s : has done second exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        myPhaser.arriveAndAwaitAdvance();

        System.out.printf("%s : is going to third exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        doExercise3();
        System.out.printf("%s : has done third exercise, on %s.\n", Thread.currentThread().getName(), new Date());
        myPhaser.arriveAndAwaitAdvance();

    }

    private void doExercise3() {
        doExercise();
    }

    private void doExercise2() {
        doExercise();
    }

    private void doExercise1() {
        doExercise();
    }

    private void doExercise() {
        int duration = (int) (Math.random() * 10);
        try {
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
