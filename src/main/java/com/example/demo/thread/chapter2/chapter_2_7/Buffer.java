package com.example.demo.thread.chapter2.chapter_2_7;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by siqingwei on 2018/6/27.
 */
public class Buffer {
    /**
     * 存储缓冲区的长度
     */
    private int maxSize;
    /**
     * 存储共享数据
     */
    private LinkedList<String> buffer;
    /**
     * 控制修改缓冲区代码块的访问
     */
    private ReentrantLock lock;
    private Condition lines;
    private Condition spaces;
    /**
     * 如果缓冲区中有行
     */
    private boolean pendingLines;

    public Buffer(){
        this.buffer = new LinkedList<>();
        this.maxSize = 20;
        this.lock = new ReentrantLock();
        this.lines = lock.newCondition();
        this.spaces = lock.newCondition();
        this.pendingLines = true;
    }

    public void insert(String line) {
        this.lock.lock();
        try {
            while (buffer.size() == maxSize) {
                spaces.await();
            }
            buffer.offer(line);
            System.out.printf("%s : Inserted the line : %d \n", Thread.currentThread().getName(), buffer.size());
            lines.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
    }

    public String get(){
        String line = null;
        this.lock.lock();
        try {
            while ((buffer.size() == 0) && hasPendingLines()) {
                lines.await();
            }
            buffer.poll();
            System.out.printf("%s : Readed line : %d\n", Thread.currentThread().getName(), buffer.size());
            spaces.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            this.lock.unlock();
        }
        return line;
    }

    public void setPendingLines(boolean pendingLines){
        this.pendingLines = pendingLines;
    }

    public boolean hasPendingLines() {
        return buffer.size() > 0 || pendingLines;
    }


}
