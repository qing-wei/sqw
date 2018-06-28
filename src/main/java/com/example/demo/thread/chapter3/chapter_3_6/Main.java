package com.example.demo.thread.chapter3.chapter_3_6;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Main {
    public static void main(String[] args) {
        MyPhaser myPhaser = new MyPhaser();

        Thread[] threads = new Thread[5];

        Student[] students = new Student[5];
        for (int i = 0; i < 5; i++) {
            students[i] = new Student(myPhaser);
            myPhaser.register();
        }

        for (int i = 0; i < 5; i++) {
            threads[i] = new Thread(students[i], "Student " + i);
            threads[i].start();
        }

        for (int i = 0; i < 5; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.printf("Main : Terminatation : %s.\n", myPhaser.isTerminated());
    }
}
