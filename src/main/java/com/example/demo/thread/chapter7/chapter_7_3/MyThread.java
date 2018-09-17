package com.example.demo.thread.chapter7.chapter_7_3;

import java.util.Date;

/**
 * Created by siqingwei on 2018/9/17.
 */
public class MyThread extends Thread {
    private Date creationDate;
    private Date startDate;
    private Date finishDate;

    public MyThread(Runnable target, String name) {
        super(target, name);
        setCreationDate();
    }

    private void setCreationDate() {
        this.creationDate = new Date();
    }

    @Override
    public void run() {
        setStartDate();
        super.run();
        setFinishDate();
    }

    private void setFinishDate() {
        this.finishDate = new Date();
    }

    private void setStartDate() {
        this.startDate = new Date();
    }

    public long getExecutionTime(){
        return finishDate.getTime() - startDate.getTime();
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append(getName());
        buffer.append(": ");
        buffer.append(" Creation Date: ");
        buffer.append(creationDate);
        buffer.append(" :Running time: ");
        buffer.append(getExecutionTime());
        buffer.append(" Milliseconds.");
        return buffer.toString();
    }
}
