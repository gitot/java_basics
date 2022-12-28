package com.interview.java.concurrent;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Demo {
    static int i = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(() -> {
            Lock lock = new ReentrantLock();
            lock.lock();
            try {
                i = 1;
            } finally {
                lock.unlock();
            }
        });
        thread.start();
        thread.join();
        System.out.println("i= " + i);


    }
}
