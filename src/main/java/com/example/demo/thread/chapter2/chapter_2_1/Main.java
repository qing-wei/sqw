package com.example.demo.thread.chapter2.chapter_2_1;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);

        Thread bankThread = new Thread(new Bank(account));
        Thread companyThread = new Thread(new Company(account));

        System.out.printf("Initial Variable: %s\n", account.getBalance());

        bankThread.start();
        companyThread.start();

        try {
            bankThread.join();
            companyThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Final Variable: %s\n", account.getBalance());
    }
}
