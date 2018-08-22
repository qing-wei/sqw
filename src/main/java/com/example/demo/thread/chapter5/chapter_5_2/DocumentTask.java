package com.example.demo.thread.chapter5.chapter_5_2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

/**
 * Created by siqingwei on 2018/8/22.
 */
public class DocumentTask extends RecursiveTask<Integer> {

    private String[][] document;
    private int start, end;
    private String word;

    public DocumentTask(String[][] document, int start, int end, String word) {
        this.document = document;
        this.start = start;
        this.end = end;
        this.word = word;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        if (end - start < 10) {
            result = processLines(document, start, end, word);
        } else {
            int middle = (start + end) / 2;
            DocumentTask task1 = new DocumentTask(document, start, middle, word);
            DocumentTask task2 = new DocumentTask(document, middle, end, word);
            invokeAll(task1, task2);
            try {
                result = task1.get() + task2.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private int processLines(String[][] document, int start, int end, String word) {
        List<LineTask> lineTasks = new ArrayList<>();
        for (int i = start; i < end; i++) {
            LineTask task = new LineTask(document[i], 0, document[i].length, word);
            lineTasks.add(task);
        }
        invokeAll(lineTasks);

        int result = 0;
        for (int i = 0; i < lineTasks.size(); i++) {
            LineTask lineTask = lineTasks.get(i);
            try {
                result += lineTask.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
