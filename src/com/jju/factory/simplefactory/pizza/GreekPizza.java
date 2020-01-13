package com.jju.factory.simplefactory.pizza;

//希腊披萨
public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作希腊披萨准备原材料");
    }
}
