package com.jju.singleton;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);        //true
        System.out.println("singleton的hashCode:" + singleton.hashCode());       //1163157884
        System.out.println("singleton1的hashCode:" + singleton1.hashCode());     //1163157884
    }

}


//饿汉式(静态变量)
class Singleton{

    //1、构造器私有化（防止new）
    private Singleton(){

    }

    //2、类的内部创建对象实例
    private final static Singleton instance = new Singleton();

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton getInstance(){
        return instance;
    }

}
