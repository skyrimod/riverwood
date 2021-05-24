package com.skyrimod.riverwood.design.composite;

/**
 * @Classname Client
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class CompositeClient {
    public static void main(String[] args) {
        MyComponent one = new Composite();
        MyComponent two = new Composite();
        MyComponent leaf = new Leaf();
        two.add(leaf);
        one.add(two);
        System.out.println("=== one ===");
        one.operation();
        System.out.println("=== two ===");
        two.operation();
        System.out.println("=== leaf ===");
        leaf.operation();

        leaf.add(one);
        two.remove(two);
        leaf.remove(two);

        System.out.println("=== one ===");
        one.operation();
        System.out.println("=== two ===");
        two.operation();

    }
}
