package com.example.demo.thread.chapter4.chapter_4_10;

import org.springframework.context.event.SourceFilteringListener;

import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class ReportProcessor implements Runnable {
    private CompletionService<String> completionService;
    private boolean end;

    public ReportProcessor(CompletionService<String> completionService) {
        this.completionService = completionService;
        this.end = false;
    }

    @Override
    public void run() {
        while (!end) {
            try {
                Future<String> result = completionService.poll(20, TimeUnit.SECONDS);
                if (result != null) {
                    try {
                        String report = result.get();
                        System.out.printf("ReportReciever: Report Recieved: %s.\n", report);
                    } catch (ExecutionException e) {
                        e.printStackTrace();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("ReportSender: End.\n");
    }

    public void setEnd(boolean end) {
        this.end = end;
    }
}
