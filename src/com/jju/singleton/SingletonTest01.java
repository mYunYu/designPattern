package com.jju.singleton;

public class SingletonTest01 {

    public static void main(String[] args) {
        Singleton01 singleton = Singleton01.getInstance();
        Singleton01 singleton1 = Singleton01.getInstance();
        System.out.println(singleton == singleton1);        //true
        System.out.println("singleton的hashCode:" + singleton.hashCode());       //1163157884
        System.out.println("singleton1的hashCode:" + singleton1.hashCode());     //1163157884
    }

}


//饿汉式(静态变量)
class Singleton01{

    //1、构造器私有化
    private Singleton01(){

    }

    //2、类的内部创建对象实例
    private final static Singleton01 instance = new Singleton01();

    //3、提供一个公有的静态方法，返回实例对象
    public static Singleton01 getInstance(){
        return instance;
    }

}
