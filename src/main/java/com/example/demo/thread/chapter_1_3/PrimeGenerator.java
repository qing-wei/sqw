package com.example.demo.thread.chapter_1_3;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class PrimeGenerator extends Thread {

    long number = 1L;

    @Override
    public void run() {
        super.run();
        while (true) {
            if (isPrime(number)) {
                System.out.printf("Number %d is Prime.\n", number);
            }

            if (isInterrupted()) {
                System.out.println("The Prime Generator has been interrupted.");
                return;
            }

            number++;
        }
    }

    private boolean isPrime(long number) {
        if (number <= 2) {
            return true;
        }

        for (int i = 2; i < number; i++) {
            if (number % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
