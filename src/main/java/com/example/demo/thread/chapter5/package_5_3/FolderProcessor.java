package com.example.demo.thread.chapter5.package_5_3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveTask;

/**
 * Created by siqingwei on 2018/8/23.
 */
public class FolderProcessor extends RecursiveTask<List<String>> {

    private static final long serialVersionUID = 1L;

    private String path;
    private String extension;

    public FolderProcessor(String path, String extension) {
        this.path = path;
        this.extension = extension;
    }

    @Override
    protected List<String> compute() {
        List<String> list = new ArrayList<>();
        List<FolderProcessor> processors = new ArrayList<>();
        File file = new File(path);
        File[] content = file.listFiles();
        if (content != null) {
            for (int i = 0; i < content.length; i++) {
                if (content[i].isDirectory()) {
                    FolderProcessor task = new FolderProcessor(content[i].getAbsolutePath(), extension);
                    task.fork();
                    processors.add(task);
                } else {
                    if (checkFile(content[i].getName())) {
                        list.add(content[i].getAbsolutePath());
                    }
                }
            }
        }

        if (processors.size() > 50) {
            System.out.printf("%s: %d tasks ran.\n", file.getAbsolutePath(), processors.size());
        }

        addResultsFromTasks(list, processors);

        return list;
    }

    private void addResultsFromTasks(List<String> list, List<FolderProcessor> processors) {
        for (FolderProcessor processor : processors) {
            list.addAll(processor.join());
        }
    }

    private boolean checkFile(String name) {
        if (name.endsWith(extension)) {
            return true;
        }
        return false;
    }
}
