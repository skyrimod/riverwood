package com.skyrimod.riverwood.design.strategy;

/**
 * @Classname OneStra
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class OneStra implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println(getClass().getSimpleName().toString());
    }
}
