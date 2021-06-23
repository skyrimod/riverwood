package com.skyrimod.riverwood.juctest;

import com.skyrimod.riverwood.thread.RunnableFactory;
import lombok.SneakyThrows;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * JUC锁
 *
 * @Classname ReetrantTest
 * @author: suixin
 * @date: 2021/6/16
 */
public class ReentrantTest {
    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void before(){
        lock.lock();
        try{
            System.out.println("before");
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }

    @SneakyThrows
    public void after(){
        lock.lock();
        try{
            condition.await();
            System.out.println("after");
        }finally {
            lock.unlock();
        }
    }

    @SneakyThrows
    @Test
    public void conditiontest(){
        ReentrantTest reentrantTest = new ReentrantTest();
        ExecutorService service = Executors.newCachedThreadPool();
        service.execute(()->reentrantTest.after());
        Thread.sleep(2000);
        service.execute(()->reentrantTest.before());
    }

    @Test
    public void test(){
        ExecutorService service = Executors.newCachedThreadPool();
        Thread thread = new Thread(() -> {
            ReentrantLock lock = new ReentrantLock();
            lock.lock();
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName()+"==="+i);
            }
        });
        for (int i = 0; i < 3; i++) {
            service.submit(thread);
        }
    }
}
