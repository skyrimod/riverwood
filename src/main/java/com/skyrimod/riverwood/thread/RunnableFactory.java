package com.skyrimod.riverwood.thread;

/**
 * Runnable工厂类
 *
 * @Classname RunnableFactory
 * @author: suixin
 * @date: 2021/6/15
 */
public class RunnableFactory {
    /**
     * interrupt()是Thread的方法，实现Runnable类则无法调用
     */
    public static Runnable whileInterrupt(){
        return () -> {
          while (!Thread.interrupted()){
              System.out.println(Thread.currentThread()+" running..");
          }
        };
    }

    public static Runnable sleepInterrupt(){
        return ()->{
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread()+"中断");
                e.printStackTrace();
            }
        };
    }
}
