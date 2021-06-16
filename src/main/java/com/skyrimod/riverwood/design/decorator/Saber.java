package com.skyrimod.riverwood.design.decorator;

/**
 * @Classname Saber
 * @Description
 * @author: suixin
 * @date: 2021/5/26
 */
public class Saber extends AbstractSaberDecorator{

    public Saber(Sorcerer sorcerer){
        super(sorcerer);
    }

    public void sword() {
        System.out.println("Excalibur！！！");
    }

    public void magic(){
        super.magic();
        this.sword();
    }
}
