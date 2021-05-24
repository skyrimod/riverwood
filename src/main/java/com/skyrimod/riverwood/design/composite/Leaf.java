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
        return;
    }

    @Override
    public MyComponent remove(MyComponent myComponent) {
        return null;
    }

    @Override
    public List<MyComponent> getChild() {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("Leaf");
    }
}
