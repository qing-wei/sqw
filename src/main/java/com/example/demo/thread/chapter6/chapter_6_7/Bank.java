package com.example.demo.thread.chapter6.chapter_6_7;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Bank implements Runnable {
    private Account account;

    public Bank(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.substractAmount(1000);
        }
    }
}
