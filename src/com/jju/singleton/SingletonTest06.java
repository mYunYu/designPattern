package com.jju.singleton;

public class SingletonTest06 {

    public static void main(String[] args) {
        Singleton06 instance = Singleton06.getInstance();
        Singleton06 instance1 = Singleton06.getInstance();
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());
    }

}

//双重检查
class Singleton06{
    private static volatile Singleton06 instance;

    private Singleton06(){

    }

    //提供一个静态的公有方法，加入双重检查代码，解决线程安全问题，同时解决懒加载问题，同时保证了效率
    public static synchronized Singleton06 getInstance(){
        if(instance == null){
            synchronized (Singleton06.class){
                if(instance == null){
                    instance = new Singleton06();
                }
            }
        }
        return instance;
    }



}
