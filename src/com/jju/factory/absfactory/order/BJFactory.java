package com.jju.factory.absfactory.order;

import com.jju.factory.absfactory.pizza.BJCheesePizza;
import com.jju.factory.absfactory.pizza.BJPepperPizza;
import com.jju.factory.absfactory.pizza.Pizza;

//工厂子类
public class BJFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new BJCheesePizza();
        }
        else if(orderType.equals("pepper")){
            pizza = new BJPepperPizza();
        }
        return pizza;
    }
}
