package com.skyrimod.riverwood.threadtest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Classname LiftOff
 * @Description
 * @author: suixin
 * @date: 2021/5/26
 */
public class LiftOff implements Runnable{
    private static int taskCount = 0;
    private final int id = taskCount++;

    public LiftOff() {
        System.out.println(id+"启动");
        System.out.println(id+"结束");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(id+"执行中。。。"+i);
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Thread(new LiftOff()).start();
        }

        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
