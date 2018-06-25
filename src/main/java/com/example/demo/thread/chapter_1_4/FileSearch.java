package com.example.demo.thread.chapter_1_4;

import java.io.File;

/**
 * Created by siqingwei on 2018/6/25.
 */
public class FileSearch implements Runnable {

    private String initFilePath;

    private String initFileName;

    public FileSearch(String initFilePath, String initFileName) {
        this.initFilePath = initFilePath;
        this.initFileName = initFileName;
    }

    @Override
    public void run() {
        File file = new File(initFilePath);
        if (file.isDirectory()) {
            try {
                directoryProcess(file);
            } catch (InterruptedException e) {
                System.out.printf("%s : The search has been interrupted.", Thread.currentThread().getName());
            }
        }
    }

    private void directoryProcess(File file) throws InterruptedException {
        File[] files = file.listFiles();
        if (null != files) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isDirectory()) {
                    directoryProcess(files[i]);
                } else {
                    fileProcess(files[i]);
                }
            }
        }

        if (Thread.interrupted()) {
            throw new InterruptedException();
        }

    }

    private void fileProcess(File file) throws InterruptedException {
        if (file.getName().equals(initFileName)) {
            System.out.printf("%s : %s\n", Thread.currentThread().getName(), file.getAbsolutePath());
        }

        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
    }
}
