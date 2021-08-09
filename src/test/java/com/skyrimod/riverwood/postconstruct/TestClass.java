package com.skyrimod.riverwood.postconstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.annotation.Commit;

import javax.annotation.PostConstruct;

/**
 * @ClassName TestClass
 * @Description
 * @Author jdj
 * @Date 2021/7/29 上午9:53
 **/
@Component
public class TestClass {
    @Autowired
    private AutoClass autoClass;

    public TestClass() {
        System.out.println("TestClass create...");
    }

    @PostConstruct
    public void testMethod(){
        System.out.println("PostConstruct...");
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "autoClass=" + autoClass +
                '}';
    }
}
