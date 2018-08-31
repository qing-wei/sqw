package com.example.demo.thread.chapter6.chapter_6_4;

import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/31.
 */
public class Event implements Delayed {
    private Date startDate;

    public Event(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        Date delay = new Date();
        long diff = this.startDate.getTime() - delay.getTime();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed o) {
        long result = this.getDelay(TimeUnit.NANOSECONDS) - o.getDelay(TimeUnit.NANOSECONDS);
        if (result < 0) {
            return -1;
        } else if (result > 0) {
            return 1;
        }
        return 0;
    }
}
