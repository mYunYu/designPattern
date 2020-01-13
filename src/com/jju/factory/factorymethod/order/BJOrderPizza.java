package com.jju.factory.factorymethod.order;

import com.jju.factory.factorymethod.pizza.BJCheesePizza;
import com.jju.factory.factorymethod.pizza.BJPepperPizza;
import com.jju.factory.factorymethod.pizza.Pizza;

public class BJOrderPizza extends OrderPizza {
    @Override
    Pizza createPizza(String orderType) {
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
