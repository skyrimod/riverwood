package com.skyrimod.riverwood;

import com.skyrimod.riverwood.design.composite.Composite;
import com.skyrimod.riverwood.design.composite.Leaf;
import com.skyrimod.riverwood.design.composite.MyComponent;
import org.junit.Test;
import sun.tools.java.Scanner;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.text.SimpleDateFormat;
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
    @Test
    public void uuidTest(){
        System.out.println(UUID.randomUUID().toString());
        Date date = new Date();
        System.out.println(date.toString());
        System.out.println(date.getTime());
        System.out.println(System.currentTimeMillis()/1000);
        System.out.println(new Long(System.currentTimeMillis()/1000).intValue());
        //System.out.println(Integer.parseInt(String.valueOf(date.getTime())));
    }
    @Test
    public void base64Test(){
        String str = "Hello World!";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        Base64.Encoder encoder = Base64.getEncoder();
        System.out.println(bytes);
        System.out.println(encoder.encode(bytes));
        System.out.println(Base64.getDecoder().decode(encoder.encode(bytes)));

        List<String> stringList = Collections.emptyList();
        stringList.add("Hello");

    }

    @Test
    public void testDate(){
        String yyyy = "yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(yyyy);
        String year = sdf.format(new Date());
        System.out.println(year);
    }

    @Test
    public void strTest(){
        List<String> oldStr = new ArrayList<>();
        oldStr.add("156811792777022972");
        oldStr.add("156811765323089878");
        oldStr.add("156811792773234183");

        List<String> dStr = new ArrayList<>();
        dStr.add("156811765323089878");
        dStr.add("156811792773234183");

        List<String> newStr = new ArrayList<>();

        for (String old : oldStr) {
            System.out.println(!dStr.contains(old));
            if (!dStr.contains(old)){
                newStr.add(old);
            }
        }
        System.out.println(newStr);
    }

    @Test
    public void strTest2(){
        String str = "Hello Java!";
        System.out.println(str.codePointCount(0, str.length()));
        System.out.println(str.codePointAt(2));

        StringBuffer sb = new StringBuffer(str);
        System.out.println(str.contentEquals(sb));

        System.out.println(str.indexOf("J".codePointAt(0)));
        System.out.println(str.lastIndexOf("J".codePointAt(0)));
        System.out.println(str.indexOf("J"));
        System.out.println(str.substring(6));
        System.out.println(str.substring(6,10));
        System.out.println(str.subSequence(6,10));
    }

    @Test
    public void strTest3(){
        String str = "Hello Java!";
        String replace = str.replace("a", "A");
        String replace2 = str.replaceAll("a", "A");
        System.out.println(replace);
        System.out.println(replace2);
        List<String> oldStr = new ArrayList<>();
        oldStr.add("156811792777022972");
        oldStr.add("156811765323089878");
        oldStr.add("156811792773234183");
        String join = String.join(",",oldStr);
        System.out.println(join);
    }
    @Test
    public void strTest4(){
        String str = "Hello Java!";
        System.out.println(str.intern());
        System.out.println(String.format("%s,Hello!","Java"));
    }

    @Test
    public void strTest5(){
        String str = "11";
        byte b = Byte.parseByte(str);
        System.out.println(b);
    }
    @Test
    public void booleanTest(){
        Boolean b1 = new Boolean(false);
        Boolean b2 = new Boolean(true);

        System.out.println(Boolean.logicalAnd(b1, b2));
        System.out.println(Boolean.logicalOr(b1, b2));
        System.out.println(Boolean.logicalXor(b1, b2));
    }

    @Test
    public void intTest(){
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        Integer integer = 655359999;
        System.out.println(Integer.toUnsignedLong(integer));

        Integer i1 = 64;
        Integer i2 = 8;
        Integer i3 = 7;

        System.out.println(Integer.divideUnsigned(i1, i3));
        System.out.println(Integer.remainderUnsigned(i1, i3));

        System.out.println(Integer.highestOneBit(integer));
    }

    @Test
    public void listTest(){
        LinkedList<String> oldStr = new LinkedList<>();
        oldStr.add("156811792777022972");
        oldStr.add("156811765323089878");
        oldStr.add("156811792773234183");

        System.out.println(oldStr.indexOf("156811765323089878"));
        System.out.println(oldStr.peek());
    }
    @Test
    public void settest(){
        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("C");
        set.add("Python");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    @Test
    public void hashTest(){
        HashMap<Object, Object> map = new HashMap<>();

        Hashtable<Object, Object> table = new Hashtable<>();

        map.put(null,null);
        map.put(null,null);
        System.out.println("map.put(null,null)");

        table.put(null,"null");
        System.out.println("table.put(null,null)");
    }

    @Test
    public void strnullTest(){
        String str = null;
        System.out.println(str.equals("666"));
    }
}
