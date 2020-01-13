package com.jju.factory.simplefactory.pizza;

//胡椒披萨
public class PepperPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(" 为制作胡椒披萨准备原材料");
    }
}
