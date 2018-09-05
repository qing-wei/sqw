package com.example.demo.thread.chapter6.chapter_6_7;

/**
 * Created by siqingwei on 2018/9/5.
 */
public class Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setBalance(1000);

        Company company = new Company(account);
        Bank bank = new Bank(account);

        Thread companyThread = new Thread(company);
        Thread bankThread = new Thread(bank);

        System.out.printf("Main: Initial balance: %d.\n", account.getBalance());

        companyThread.start();
        bankThread.start();

        try {
            companyThread.join();
            bankThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Main: Final balance: %d.\n", account.getBalance());
    }
}
