package com.jju.factory.absfactory.order;

public class PizzaStore {

    public static void main(String[] args) {
        new OrderPizza(new LDFactory());
    }

}
