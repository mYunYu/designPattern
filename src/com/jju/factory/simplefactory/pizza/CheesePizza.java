package com.jju.factory.simplefactory.pizza;

//奶酪披萨
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作奶酪披萨准备原材料");
    }
}
