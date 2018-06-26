package com.example.demo.thread.chapter1.chapter_1_12;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadFactory;

/**
 * Created by siqingwei on 2018/6/26.
 */
public class MyThreadFactory implements ThreadFactory {

    private int counter;
    private String name;
    private List<String> strList;

    public MyThreadFactory(String name) {
        this.counter = 0;
        this.name = name;
        this.strList = new ArrayList<>();
    }

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r, name + "_Thread-" + counter);
        counter++;
        String str = String.format("created thread %s with name %s on %s.", thread.getId(), thread.getName(), new Date());
        strList.add(str);
        return thread;
    }

    public String getStrList(){
        StringBuffer stringBuffer = new StringBuffer();
        for (String str : strList) {
            stringBuffer.append(str);
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
