package com.jju.factory.factorymethod.order;

import com.jju.factory.factorymethod.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public abstract class OrderPizza {

    //定义一个抽象方法，让各个工厂子类自己实现
    abstract Pizza createPizza(String orderType);

    public OrderPizza(){
        Pizza pizza = null;
        String orderType;       //订购披萨的类型
        do {
            orderType = getType();
            pizza = createPizza(orderType);         //抽象方法，由工厂子类完成
            //输出pizza制作过程
            pizza.prepare();
            pizza.back();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    //获取用户希望订购的披萨种类
    private String getType(){
        try{
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入的披萨种类：");
            return bufferedReader.readLine();
        }catch (Exception e){
            e.printStackTrace();
            return "";
        }
    }

}
