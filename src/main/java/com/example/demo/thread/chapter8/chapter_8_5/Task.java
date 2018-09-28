package com.example.demo.thread.chapter8.chapter_8_5;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/**
 * Created by siqingwei on 2018/9/27.
 */
public class Task  implements Runnable{

    @Override
    public void run() {
        Logger logger = MyLogger.getLogger(this.getClass().getName());
        logger.entering(Thread.currentThread().getName(), "run()");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        logger.exiting(Thread.currentThread().getName(), "run()", Thread.currentThread());
    }
}
