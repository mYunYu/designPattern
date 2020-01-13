package com.jju.factory.simplefactory.order;

//测试，定义一个客户端
public class PizzaStore {

    public static void main(String[] args) {
        //使用简单工厂模式
        new OrderPizza(new SimpleFactory());
        System.out.println("退出程序");
    }

}
