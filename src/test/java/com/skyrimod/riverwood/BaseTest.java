package com.skyrimod.riverwood;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @ClassName BaseTest
 * @Description 测试基类，其他测试类需要继承这个类
 * @Author jdj
 * @Date 2021/7/29 上午9:50
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = RiverwoodApplication.class)
public class BaseTest {
}
