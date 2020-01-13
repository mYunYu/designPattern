package com.jju.factory.simplefactory.order;

import com.jju.factory.simplefactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OrderPizza {

    //定义一个简单工厂对象
    SimpleFactory simpleFactory;
    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){
        setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        String orderType = "";

        //设置简单工厂模式
        this.simpleFactory = simpleFactory;

        do {
            orderType = getType();
            pizza = this.simpleFactory.createPizza(orderType);

            //输出披萨
            if(pizza != null){      //表示订购成功
                pizza.prepare();
                pizza.back();
                pizza.cut();
                pizza.box();
            }
            else{
                System.out.println("订购披萨失败");
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
