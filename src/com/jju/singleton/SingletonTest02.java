package com.jju.singleton;

public class SingletonTest02 {

    public static void main(String[] args) {
        Singleton02 instance = Singleton02.getInstance();
        Singleton02 instance1 = Singleton02.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());     //1163157884
    }

}

//饿汉式（静态代码块）
class Singleton02{

    //1、构造器私有化
    private Singleton02(){

    }

    //2、类的内部创建对象实例
    private static Singleton02 singleton02;

    //在静态代码块中，创建单例对象
    static {
        singleton02 = new Singleton02();
    }

    //3、创建一个公有的静态方法，返回实例对象
    public static Singleton02 getInstance(){
        return singleton02;
    }

}
