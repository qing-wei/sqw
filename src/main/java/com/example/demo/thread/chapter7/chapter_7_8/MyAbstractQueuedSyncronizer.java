package com.example.demo.thread.chapter7.chapter_7_8;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * Created by siqingwei on 2018/9/25.
 */
public class MyAbstractQueuedSyncronizer extends AbstractQueuedSynchronizer {
    private AtomicInteger state;

    public MyAbstractQueuedSyncronizer() {
        this.state = new AtomicInteger(0);
    }

    @Override
    protected boolean tryAcquire(int arg) {
        return state.compareAndSet(0, 1);
    }

    @Override
    protected boolean tryRelease(int arg) {
        return state.compareAndSet(1, 0);
    }
}
