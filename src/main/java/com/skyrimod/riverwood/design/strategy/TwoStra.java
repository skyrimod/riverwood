package com.skyrimod.riverwood.design.strategy;

/**
 * @Classname TwoStra
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class TwoStra implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println(getClass().getSimpleName().toString());
    }
}
