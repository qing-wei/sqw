package com.example.demo.thread.chapter8.chapter_8_5;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by siqingwei on 2018/9/27.
 */
public class MyLogger {
    private static Handler handler;
    public static Logger getLogger(String name) {
        Logger logger = Logger.getLogger(name);
        logger.setLevel(Level.ALL);
        try {
            if (handler == null) {
                handler = new FileHandler("recipe8.log");
                Formatter formatter = new MyFormatter();
                handler.setFormatter(formatter);
            }

            if (logger.getHandlers().length == 0) {
                logger.addHandler(handler);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logger;
    }
}
