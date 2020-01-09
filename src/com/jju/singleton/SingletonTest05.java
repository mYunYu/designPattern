package com.jju.singleton;

public class SingletonTest05 {

    public static void main(String[] args) {
        Singleton05 instance = Singleton05.getInstance();
        Singleton05 instance1 = Singleton05.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());
    }

}

//懒汉式(线程安全，同步代码块)
class Singleton05{
    private static Singleton05 instance;

    private Singleton05(){

    }

    public static Singleton05 getInstance(){
        if(instance == null){
            synchronized (Singleton05.class){
                instance = new Singleton05();
            }
        }
        return instance;
    }

}
