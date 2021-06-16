package com.skyrimod.riverwood;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
class RiverwoodApplicationTests {
    @Resource
    RestTemplate restTemplate;

    @Test
    void contextLoads() {
        System.out.println("riverwood");
        String url = "";
    }

}
