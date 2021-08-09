package com.skyrimod.riverwood.postconstruct;

import com.skyrimod.riverwood.BaseTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName PCTest
 * @Description
 * @Author jdj
 * @Date 2021/7/29 上午9:53
 **/
public class PCTest extends BaseTest {
    @Autowired
    TestClass testClass;
    @Test
    public void test(){
        System.out.println(testClass.toString());
    }
}
