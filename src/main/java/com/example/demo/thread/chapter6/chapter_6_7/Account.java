package com.example.demo.thread.chapter6.chapter_6_7;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Account {
    private AtomicLong balance;

    public Account() {
        this.balance = new AtomicLong();
    }

    public long getBalance() {
        return balance.get();
    }

    public void setBalance(long balance) {
        this.balance.set(balance);
    }

    public void addAmount(long amount) {
        this.balance.getAndAdd(amount);
    }

    public void substractAmount(long amount) {
        this.balance.getAndAdd(-amount);
    }
}
