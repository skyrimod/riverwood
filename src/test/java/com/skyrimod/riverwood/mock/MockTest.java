package com.skyrimod.riverwood.mock;

import com.skyrimod.riverwood.BaseTest;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import static org.mockito.Mockito.*;

import java.util.*;

/**
 * @ClassName MockTest
 * @Description mock测试
 * @Author jdj
 * @Date 2021/7/29 下午3:23
 **/
public class MockTest{
    @Test
    public void test6(){
        List mock = mock(List.class);

        doAnswer(f -> {
            return false;
        }).when(mock).isEmpty();

        System.out.println(mock.isEmpty());

        Map map = new HashMap<String,Object>(){
            {
                this.put("a",1);
                this.put("b",2);
                this.put("c",3);
            }
        };

        for (Object o : map.entrySet()) {
            System.out.println(o);
        }
    }
    @Test
    public void test5(){
        ArrayList<String> list = new ArrayList();
        list.add("a");
        list.add("b");

        ArrayList mock = mock(ArrayList.class);
        mock.addAll(list);

        ArgumentCaptor<ArrayList> captor = ArgumentCaptor.forClass(ArrayList.class);
        verify(mock).addAll(captor.capture());

        Assert.assertEquals(captor.getValue().size(),2);
        Assert.assertEquals(captor.getValue(),list);
    }
    @Test
    public void test4(){
        ArrayList<String> str = new ArrayList<>();
        ArrayList<String> spy = spy(str);

        spy.add("a");
        spy.add("b");
        when(spy.size()).thenReturn(100);

        Assert.assertEquals(spy.get(0),"a");
        Assert.assertEquals(spy.get(1),"b");
        Assert.assertEquals(spy.size(),100);
    }
    @Test
    public void test3(){
        List mockList = mock(List.class);

        mockList.add("one");
        mockList.add("two");
        mockList.add("two");
        mockList.add("three");
        mockList.add("three");
        mockList.add("three");

        when(mockList.size()).thenReturn(6);
        Assert.assertEquals(mockList.size(),6);

        verify(mockList,atLeastOnce()).add("one");
        verify(mockList,times(2)).add("two");
        verify(mockList,times(3)).add("three");
    }
    @Test
    public void test2(){
        Iterator mock = mock(Iterator.class);
        when(mock.next()).thenReturn("Hello").thenReturn("Mockito!");
        String result = mock.next() + " " + mock.next();
        Assert.assertEquals(result,"Hello Mockito!");

        // 类似于环境配置context
        doThrow(new RuntimeException()).when(mock).next();
        mock.next();
    }
    @Test
    public void test1(){
        List mockList = mock(List.class);
        Assert.assertTrue(mockList instanceof List);

        when(mockList.add("a")).thenReturn(true);
        Assert.assertTrue(mockList.add("a"));

        doThrow(new RuntimeException()).when(mockList).add("b");
        mockList.add("b");
    }
}
