package com.jju.factory.absfactory.order;

import com.jju.factory.absfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    AbsFactory absFactory;

    public OrderPizza(AbsFactory factory){
        setFactory(factory);
    }

    private void setFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String orderType = "";
        this.absFactory = absFactory;
        do {
            orderType = getType();
            pizza = absFactory.createPizza(orderType);         //抽象方法，由工厂子类完成
            if(pizza != null){      //订购ok
                //输出pizza制作过程
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
            }
            else{
                System.out.println("订购失败");
                break;
            }
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
