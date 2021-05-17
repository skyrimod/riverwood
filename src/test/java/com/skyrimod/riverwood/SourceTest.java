package com.skyrimod.riverwood;

import org.junit.Test;
import sun.tools.java.Scanner;

import java.io.File;
import java.util.*;
import static java.util.stream.Collectors.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Classname SourceTest
 * @Description
 * @author: suixin
 * @date: 2021/5/11
 */
public class SourceTest {
    @Test
    public void test(){
        Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
//        //locales.forEach(System.out::print);
//        Map<String, String> languageNames = locales.collect(Collectors.toMap(
//                Locale::getDisplayLanguage,
//                locale -> locale.getDisplayLanguage(locale),
//                (p1, p2) -> p1
//        ));
//        //languageNames.entrySet().forEach(System.out::println);
//        Map<String, Set<String>> collect = locales.collect(Collectors.toMap(
//                Locale::getDisplayCountry,
//                locale -> Collections.singleton(locale.getDisplayLanguage()),
//                (a, b) -> {
//                    HashSet<String> set = new HashSet<>(a);
//                    set.addAll(b);
//                    return set;
//                }
//        ));
//        collect.entrySet().forEach(System.out::println);
        //Map<String, List<Locale>> collect = locales.collect(groupingBy(Locale::getCountry));
       // collect.entrySet().forEach(System.out::println);
        Map<String, Set<String>> collect = locales.collect(
                groupingBy(Locale::getCountry, mapping(Locale::getDisplayLanguage, toSet()))
        );
        collect.entrySet().forEach(System.out::println);
    }

    @Test
    public void fileTest(){
        File file = new File("/");

       // System.out.println(file.getParentFile().getAbsolutePath());
    }
}
