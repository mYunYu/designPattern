package com.jju.factory.simplefactory.pizza;

//把pizza类做成抽象类
public abstract class Pizza {

    protected String name;      //名称

    public abstract void prepare();     //准备原材料，不同的披萨原材料不一样，所以做成抽象方法

    public void setName(String name) {
        this.name = name;
    }

    //烘焙
    public void back(){
        System.out.println(name + " baking");
    }

    //切割
    public void cut(){
        System.out.println(name + " cutting");
    }

    //打包
    public void box(){
        System.out.println(name + " boxing");
    }

}
