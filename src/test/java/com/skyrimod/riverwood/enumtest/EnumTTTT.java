package com.skyrimod.riverwood.enumtest;

import ch.qos.logback.core.pattern.ConverterUtil;
import lombok.Data;
import lombok.SneakyThrows;
import lombok.ToString;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.poi.util.StringUtil;
import org.junit.Test;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName EnumTTTT
 * @Description
 * @Author jdj
 * @Date 2021/8/19 下午3:08
 **/
public class EnumTTTT {
    @Test
    public void test33(){
        List<String> ips = new ArrayList<>();
        ips.add("111.111.234.765");
       // ips.add("134.111.23.765");
        ips.add("111.75.234.87");
        //ips.add("234.111.56.33");
        ips.add("543.22.65.13");

        String ip = "543.22.65.13,111.75.234.87,111.111.234.765";

        String[] split = ip.split(",");
        Arrays.stream(split).forEach(System.out::println);
        List<String> newIps = Arrays.asList(split);

        System.out.println(ips.containsAll(newIps));
        System.out.println(newIps.containsAll(ips));

    }
    @Data
    @ToString
    class TestTom{
        private Integer i;
        private String s;
    }
    @SneakyThrows
    @Test
    public void test1(){
        TestTom testTom = new TestTom();
        Class<? extends TestTom> clazz = testTom.getClass();

        Field field = clazz.getDeclaredField("i");
        field.setAccessible(true);
        field.set(testTom, ConvertUtils.convert("0",field.getType()));
        System.out.println(testTom);
    }

    @Test
    public void test(){
        System.out.println(EnumTest.valueOf("ONE").getValue());
        System.out.println(EnumTest.valueOf("ONE").name().toLowerCase());
    }
}
