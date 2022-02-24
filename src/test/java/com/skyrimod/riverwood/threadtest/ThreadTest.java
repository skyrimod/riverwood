package com.skyrimod.riverwood.threadtest;

import org.assertj.core.util.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Classname ThreadTest
 * @Description
 * @author: suixin
 * @date: 2021/5/14
 */
public class ThreadTest {
    public static void main(String[] args) throws InterruptedException {
        DeadLock deadLock = new DeadLock();
        List<Thread> list = Lists.newArrayList();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(() -> {
                while (true) {
                    String s = null;
                    try {
                        s = deadLock.get();
                        System.out.println(Thread.currentThread().getName() + s);
                    } catch (InterruptedException e) {
                        return;
                    }
                }
            });
            t.start();
            list.add(t);
        }
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                String s = "t-" + Math.random();
                System.out.println("add task" + s);
                deadLock.add(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        thread.start();
        thread.join();
        Thread.sleep(100);
        for (Thread thread1 : list) {
            thread1.interrupt();
        }
    }
}

class DeadLock{
    Queue<String> queue = new LinkedList<>();

    public synchronized void add(String s){
        this.queue.add(s);
        this.notifyAll();
    }

    public synchronized String get() throws InterruptedException {
        while (queue.isEmpty()){
            this.wait();
        }
        return this.queue.remove();
    }
}




