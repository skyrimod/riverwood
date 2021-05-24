package com.skyrimod.riverwood.design.strategy;

/**
 * @Classname StraClient
 * @Description
 * @author: suixin
 * @date: 2021/5/24
 */
public class StraClient {
    public static void main(String[] args) {
        OneStra oneStra = new OneStra();
        TwoStra twoStra = new TwoStra();

        MyEnvironment myEnvironment = new MyEnvironment(oneStra);
        myEnvironment.doStrategy();

        myEnvironment.setStrategy(twoStra);
        myEnvironment.doStrategy();
    }
}
