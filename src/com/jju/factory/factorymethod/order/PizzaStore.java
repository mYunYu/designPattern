package com.jju.factory.factorymethod.order;

public class PizzaStore {

    public static void main(String[] args) {
        String str = "bj";
        if(str.equals("bj")){
            //创建北京口味的各种pizza
            new BJOrderPizza();
        }
        else{
            //创建伦敦口味的各种pizza
            new LDOrderPizza();
        }
    }

}
