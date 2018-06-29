package com.example.demo.thread.chapter3.chapter_3_7;

import java.util.List;
import java.util.concurrent.Exchanger;

/**
 * Created by siqingwei on 2018/6/29.
 */
public class Consumer implements Runnable {

    private List<String> buffer;
    private final Exchanger<List<String>> exchanger;

    public Consumer(List<String> buffer, Exchanger<List<String>> exchanger) {
        this.buffer = buffer;
        this.exchanger = exchanger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("Consumer : Cycle : %d.\n", (i + 1));

            try {
                buffer = exchanger.exchange(buffer);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int j = 0; j < 10; j++) {
                String message = buffer.get(0);
                System.out.printf("Consumer : %s.\n", message);
                buffer.remove(0);
            }
        }
    }
}
