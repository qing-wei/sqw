package com.example.demo.thread.chapter6.chapter_6_7;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Company implements Runnable {
    private Account account;

    public Company(Account account) {
        this.account = account;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            account.addAmount(1000);
        }
    }
}
