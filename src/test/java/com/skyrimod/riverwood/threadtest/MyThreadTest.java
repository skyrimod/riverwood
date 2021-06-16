package com.skyrimod.riverwood.threadtest;

import com.skyrimod.riverwood.thread.RunnableFactory;
import org.junit.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 测试
 *
 * @Classname MyThreadTest
 * @author: suixin
 * @date: 2021/6/15
 */
public class MyThreadTest {
    @Test
    public void test1(){
        ExecutorService service = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            Future<?> submit = service.submit(RunnableFactory.whileInterrupt());
            submit.cancel(true);
        }
        service.shutdown();
    }
}
