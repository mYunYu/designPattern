package com.jju.factory.factorymethod.order;

import com.jju.factory.factorymethod.pizza.LDCheesePizza;
import com.jju.factory.factorymethod.pizza.LDPepperPizza;
import com.jju.factory.factorymethod.pizza.Pizza;

public class LDOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
