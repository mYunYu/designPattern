package com.jju.singleton;

public class SingletonTest08 {

    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);        //true
        System.out.println("instance的hashCode:" + instance.hashCode());       //1163157884
        System.out.println("instance1的hashCode:" + instance1.hashCode());

        instance.ok();
    }

}

//使用枚举，实现单例
enum Singleton{
    INSTANCE;   //属性
    public void ok(){
        System.out.println("ok");
    }
}

