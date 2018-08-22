package com.example.demo.thread.chapter5.chapter_5_2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.RecursiveTask;

/**
 * Created by siqingwei on 2018/8/22.
 */
public class LineTask extends RecursiveTask<Integer> {
    private String[] line;
    private int start, end;
    private String word;

    public LineTask(String[] line, int start, int end, String word) {
        this.line = line;
        this.start = start;
        this.end = end;
        this.word = word;
    }

    @Override
    protected Integer compute() {
        int result = 0;
        if (end - start < 100) {
            result = processLine(line, start, end, word);
        } else {
            int middle = (start + end) / 2;
            LineTask lineTask1 = new LineTask(line, start, middle, word);
            LineTask lineTask2 = new LineTask(line, middle, end, word);
            invokeAll(lineTask1, lineTask2);
            try {
                result = lineTask1.get() + lineTask2.get();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    private int processLine(String[] line, int start, int end, String word) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (line[i].equals(word)) {
                count++;
            }
        }

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return count;
    }
}
