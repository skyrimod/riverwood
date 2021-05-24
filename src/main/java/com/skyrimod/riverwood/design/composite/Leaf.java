package com.skyrimod.riverwood.design.composite;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname Leaf
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class Leaf implements MyComponent {
    @Override
    public void add(MyComponent myComponent) {
        System.out.println("叶子节点，禁止add");
    }

    @Override
    public MyComponent remove(MyComponent parent) {
        System.out.println("删除叶子节点leaf");
        MyComponent remove = parent.remove(this);
        return remove;
    }

    @Override
    public List<MyComponent> getChild() {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("leaf");
    }
}
