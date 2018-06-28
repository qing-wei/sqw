package com.example.demo.thread.chapter3.chapter_3_5;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Phaser;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/6/28.
 */
public class FileSearch implements Runnable {

    private String initPath;
    private String end;
    private List<String> pathList;
    private Phaser phaser;

    public FileSearch(String initPath, String end, Phaser phaser){
        this.initPath = initPath;
        this.end = end;
        this.phaser = phaser;

        pathList = new ArrayList<>();
    }

    private void directoryProcess(File file) {
        File[] files = file.listFiles();
        if (files != null && files.length > 0) {
            for (File sonFile : files) {
                if (sonFile.isDirectory()) {
                    directoryProcess(sonFile);
                } else {
                    fileProcess(sonFile);
                }
            }
        }
    }

    private void fileProcess(File sonFile) {
        if (sonFile.getName().endsWith(end)) {
            this.pathList.add(sonFile.getAbsolutePath());
        }
    }

    private void filterResults(){
        List<String> newList = new ArrayList<>();
        long currentTime = System.currentTimeMillis();
        long dayTime = TimeUnit.MILLISECONDS.convert(1, TimeUnit.DAYS);
        for (String path : pathList) {
            File file = new File(path);
            long lastModifyTime = file.lastModified();
            if (currentTime - lastModifyTime < dayTime) {
                newList.add(path);
            }
        }
        pathList = newList;
    }

    private boolean checkResults(){
        if (pathList.size() == 0) {
            System.out.printf("Thread %s: Phase %d : has no results.\n", Thread.currentThread().getName(), phaser.getPhase());
            phaser.arriveAndDeregister();
            return false;
        } else {
            System.out.printf("Thread %s: Phase %d : has %d results.\n", Thread.currentThread().getName(), phaser.getPhase(), pathList.size());
            phaser.arriveAndAwaitAdvance();
            return true;
        }
    }

    private void showInfo(){
        for (String path : pathList) {
            System.out.printf("%s : Path: %s.\n", Thread.currentThread().getName(), path);
        }
        phaser.arriveAndAwaitAdvance();
    }


    @Override
    public void run() {
        phaser.arriveAndAwaitAdvance();
        System.out.printf("Thread: %s : File Search start...\n", Thread.currentThread().getName());

        File file = new File(initPath);
        if (file.isDirectory()) {
            this.directoryProcess(file);
        } else {
            return;
        }

        if (!checkResults()) {
            return;
        }

        filterResults();

        if (!checkResults()) {
            return;
        }

        showInfo();
        phaser.arriveAndDeregister();
        System.out.printf("Thread: %s : File Search finished.\n", Thread.currentThread().getName());
    }
}
