package com.jju.factory.absfactory.order;

import com.jju.factory.absfactory.pizza.LDCheesePizza;
import com.jju.factory.absfactory.pizza.LDPepperPizza;
import com.jju.factory.absfactory.pizza.Pizza;

public class LDFactory implements AbsFactory {
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        if(orderType.equals("cheese")){
            pizza = new LDCheesePizza();
        }
        else if(orderType.equals("pepper")){
            pizza = new LDPepperPizza();
        }
        return pizza;
    }
}
