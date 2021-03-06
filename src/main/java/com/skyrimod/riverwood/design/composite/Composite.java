package com.skyrimod.riverwood.design.composite;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Composite
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class Composite implements MyComponent {
    private List<MyComponent> myComponents = new ArrayList<>();
    @Override
    public void add(MyComponent myComponent) {
        myComponents.add(myComponent);
    }

    @Override
    public MyComponent remove(MyComponent myComponent) {
        if (myComponent instanceof Leaf){
            int i = 0;
            for (; i < myComponents.size(); i++) {
                if (myComponents.get(i).equals(myComponent)){
                    break;
                }
            }
            return myComponents.remove(i);
        }
        if (myComponent instanceof Composite){
            System.out.println("不是叶子节点，禁止删除");
        }
        return null;
    }

    @Override
    public List<MyComponent> getChild() {
        return this.myComponents;
    }

    @Override
    public void operation() {
        System.out.println("composite");
        List<MyComponent> child = getChild();
        child.forEach(MyComponent::operation);
    }
}
