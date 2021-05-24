package com.skyrimod.riverwood.design.composite;

import java.util.List;

/**
 * @Classname Component
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public interface MyComponent {
    void add(MyComponent myComponent);
    MyComponent remove(MyComponent myComponent);
    List<MyComponent> getChild();

    void operation();
}
