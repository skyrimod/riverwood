package com.skyrimod.riverwood.enumtest;

/**
 * @ClassName EnumTest
 * @Description
 * @Author jdj
 * @Date 2021/8/19 下午3:07
 **/
public enum EnumTest {
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(4);


    private int value;

    EnumTest(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
