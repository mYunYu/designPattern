package com.jju.factory.simplefactory.order;

import com.jju.factory.simplefactory.pizza.CheesePizza;
import com.jju.factory.simplefactory.pizza.GreekPizza;
import com.jju.factory.simplefactory.pizza.PepperPizza;
import com.jju.factory.simplefactory.pizza.Pizza;

//简单工厂类
public class SimpleFactory {

    //根据orderType，返回对应的pizza对象
    public Pizza createPizza(String orderType){
        Pizza pizza = null;

        if(orderType.equals("greek")){
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        }
        else if(orderType.equals("cheese")){
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        }
        else if(orderType.equals("pepper")){
            pizza = new PepperPizza();
            pizza.setName("胡椒披萨");
        }
        return pizza;
    }

}
