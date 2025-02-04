package com.multi_threading;

import java.util.concurrent.locks.ReentrantLock;

// ReentrantLock is a more advanced synchronization mechanism than synchronized, providing finer control over locking.

class Counter {
    private int count = 0;
    private final ReentrantLock lock = new ReentrantLock();

    public void increment() {
        lock.lock();  // Locking
        try {
            count++;
        } finally {
            lock.unlock();  // Unlocking
        }
    }

    public int getCount() {
        return count;
    }
}

public class ReentrantLockExample {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 1000; i++) counter.increment();
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
