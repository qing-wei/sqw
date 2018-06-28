package com.example.demo.thread.chapter3.chapter_3_5;

import java.util.concurrent.Phaser;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class Main {
    public static void main(String[] args) {
        String systemPath = "C:\\Windows";
        String appPath = "C:\\Users\\Administrator\\.IntelliJIdea15";
        String documentPath = "C:\\Documents And Settings";
        String end = ".log";

        Phaser phaser = new Phaser(3);

        FileSearch systemSearch = new FileSearch(systemPath, end, phaser);
        FileSearch appSearch = new FileSearch(appPath, end, phaser);
        FileSearch documentSearch = new FileSearch(documentPath, end, phaser);

        Thread systemThread = new Thread(systemSearch, "System");
        Thread appThread = new Thread(appSearch, "App");
        Thread documentThread = new Thread(documentSearch, "Document");

        systemThread.start();
        appThread.start();
        documentThread.start();

        try {
            systemThread.join();
            appThread.join();
            documentThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Terminated: " + phaser.isTerminated());
    }
}
