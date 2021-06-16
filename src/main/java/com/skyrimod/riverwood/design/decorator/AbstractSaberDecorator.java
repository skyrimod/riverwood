package com.skyrimod.riverwood.design.decorator;

/**
 * @Classname AbstractSaberDecorator
 * @Description
 * @author: suixin
 * @date: 2021/5/26
 */
public abstract class AbstractSaberDecorator implements Sorcerer{
    private Sorcerer sorcerer;

    public AbstractSaberDecorator(Sorcerer sorcerer) {
        this.sorcerer = sorcerer;
    }

    @Override
    public void magic() {
        sorcerer.magic();
    }
}
