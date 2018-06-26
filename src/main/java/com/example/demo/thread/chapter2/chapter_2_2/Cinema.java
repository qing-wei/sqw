package com.example.demo.thread.chapter2.chapter_2_2;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class Cinema {
    private long vacanciesCinema1;
    private long vacanciesCinema2;

    private Object controlCinema1;
    private Object controlCinema2;

    public Cinema(){
        vacanciesCinema1 = 20;
        vacanciesCinema2 = 20;
        controlCinema1 = new Object();
        controlCinema2 = new Object();
    }

    public void sellTickets1(long number){
        synchronized (controlCinema1) {
            if (number < vacanciesCinema1) {
                vacanciesCinema1 -= number;
            }
        }
    }

    public void sellTickets2(long number){
        synchronized (controlCinema2) {
            if (number < vacanciesCinema2) {
                vacanciesCinema2 -= number;
            }
        }
    }

    public void returnTickets1(long number){
        synchronized (controlCinema1) {
            vacanciesCinema1 += number;
        }
    }

    public void returnTickets2(long number){
        synchronized (controlCinema2) {
            vacanciesCinema2 += number;
        }
    }

    public long getVacanciesCinema1() {
        return vacanciesCinema1;
    }

    public long getVacanciesCinema2() {
        return vacanciesCinema2;
    }
}
