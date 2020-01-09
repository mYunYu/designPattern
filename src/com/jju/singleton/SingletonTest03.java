package com.jju.singleton;

public class SingletonTest03 {

    public static void main(String[] args) {
        Singleton03 instance = Singleton03.getInstance();
        Singleton03 instance1 = Singleton03.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());     //1163157884
    }

}

//懒汉式(线程不安全)
class Singleton03{

    private static Singleton03 instance;

    private Singleton03(){

    }

    //提供一个静态的公有方法，当使用到该方法时，才去创建instance
    public static Singleton03 getInstance(){
        if(instance == null){
            instance = new Singleton03();
        }
        return instance;
    }


}
