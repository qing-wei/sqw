package com.example.demo.thread.chapter2.chapter_2_1;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public synchronized void addAmount(double amount){
        double temp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp += amount;
        balance = temp;
    }

    public synchronized void substractAmount(double amount){
        double temp = balance;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        temp -= amount;
        balance = temp;
    }
}
