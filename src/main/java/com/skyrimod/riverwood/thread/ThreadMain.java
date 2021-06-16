package com.skyrimod.riverwood.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * main
 *
 * @Classname ThreadMain
 * @author: suixin
 * @date: 2021/6/15
 */
public class ThreadMain {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            System.out.println("main run "+ i);
            service.execute(myRunnable);
        }
        service.shutdown();
    }

}
