package com.skyrimod.riverwood.thread;

import lombok.SneakyThrows;

/**
 * 自定义Runnable
 *
 * @Classname MyRunnable
 * @author: suixin
 * @date: 2021/6/15
 */
public class MyRunnable implements Runnable{
    private Integer i = 1;
    @SneakyThrows
    @Override
    public void run() {
        for (int j = 0; j < 5; j++) {
            System.out.println(Thread.currentThread()+" before..."+i);
            ++i;
            //Thread.yield();
            //Thread.interrupted();
            System.out.println(Thread.currentThread()+" after..."+i);
            //--i;
        }
    }
}
