package com.example.demo.thread.chapter4.chapter_4_10;

import java.util.concurrent.CompletionService;

/**
 * Created by siqingwei on 2018/8/20.
 */
public class ReportRequest implements Runnable {
    private String name;
    private CompletionService<String> completionService;

    public ReportRequest(String name, CompletionService<String> completionService) {
        this.name = name;
        this.completionService = completionService;
    }

    @Override
    public void run() {
        ReportGenerator reportGenerator = new ReportGenerator(this.name, "Report");
        completionService.submit(reportGenerator);
    }
}
