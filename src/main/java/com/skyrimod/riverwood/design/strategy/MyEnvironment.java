package com.skyrimod.riverwood.design.strategy;

/**
 * @Classname MyEnvironment
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class MyEnvironment {
    private Strategy strategy;

    public MyEnvironment(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doStrategy(){
        strategy.strategyMethod();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
