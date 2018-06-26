package com.example.demo.thread.chapter2.chapter_2_1;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Bank implements Runnable {

    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            account.substractAmount(1000);
        }
    }
}
