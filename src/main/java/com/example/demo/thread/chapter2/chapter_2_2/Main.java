package com.example.demo.thread.chapter2.chapter_2_2;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Main {
    public static void main(String[] args) {
        Cinema cinema = new Cinema();
        Thread office1 = new Thread(new TicketOffice1(cinema), "TicketOffice1");
        Thread office2 = new Thread(new TicketOffice2(cinema), "TicketOffice2");

        office1.start();
        office2.start();

        try {
            office1.join();
            office2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("Room 1 Vacancies: %d\n", cinema.getVacanciesCinema1());
        System.out.printf("Room 2 Vacancies: %d\n", cinema.getVacanciesCinema2());
    }
}
