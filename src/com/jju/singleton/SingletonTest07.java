package com.jju.singleton;

public class SingletonTest07 {

    public static void main(String[] args) {
        Singleton07 instance = Singleton07.getInstance();
        Singleton07 instance1 = Singleton07.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());
    }

}

//静态内部类
class Singleton07{
    private static volatile Singleton07 instance;

    //构造器私有化
    private Singleton07(){

    }

    //创建一个静态内部类，该类中有一个静态属性 Singleton07
    private static class SingletonInstance{
        private static final Singleton07 INSTANCE = new Singleton07();
    }

    //提供一个静态的公有方法，直接返回SingletonInstance.INSTANCE
    public static synchronized Singleton07 getInstance(){
        return SingletonInstance.INSTANCE;
    }

}
