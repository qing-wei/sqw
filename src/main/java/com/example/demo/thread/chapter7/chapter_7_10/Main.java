package com.example.demo.thread.chapter7.chapter_7_10;

/**
 * Created by siqingwei on 2018/9/26.
 */
public class Main {
    public static void main(String[] args) {
        ParkingCounter counter = new ParkingCounter(5);
        Senor1 senor1 = new Senor1(counter);
        Senor2 senor2 = new Senor2(counter);

        Thread senor1Thread = new Thread(senor1);
        Thread senor2Thread = new Thread(senor2);

        senor1Thread.start();
        senor2Thread.start();

        try {
            senor1Thread.join();
            senor2Thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Number of the cars: %d\n", counter.get());
        System.out.printf("Main: End of the program.\n");
    }
}
