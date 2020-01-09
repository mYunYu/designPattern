package com.jju.singleton;

public class SingletonTest04 {

    public static void main(String[] args) {
        Singleton04 instance = Singleton04.getInstance();
        Singleton04 instance1 = Singleton04.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());     //1163157884
    }

}

//懒汉式(线程安全，同步方法)
class Singleton04{
    private static Singleton04 instance;

    private Singleton04(){

    }

    //提供一个静态的公有方法，加入同步处理的代码，解决线程安全问题
    public static synchronized Singleton04 getInstance(){
        if(instance == null){
            instance = new Singleton04();
        }
        return instance;
    }

}
