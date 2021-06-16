package com.skyrimod.riverwood.design.decorator;

/**
 * @Classname GandalfFight
 * @Description
 * @author: suixin
 * @date: 2021/5/26
 */
public class GandalfFight {
    public static void main(String[] args) {
        System.out.println("普通的Sorcerer =====> ");
        Sorcerer gandalf = new Gandalf();
        gandalf.magic();
        System.out.println("I am Gandalf!!! =====>");
        Sorcerer saber = new Saber(gandalf);
        saber.magic();
    }
}
