package com.jju.prototype.deepclone;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "宋江";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("大牛", "小牛");

        //方式1 完成深拷贝
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();

        System.out.println("deepProtoType.name=" + deepProtoType.name + "deepProtoType.deepCloneableTarget=" + deepProtoType.deepCloneableTarget.hashCode());
		System.out.println("deepProtoType1.name=" + deepProtoType1.name + "deepProtoType1.deepCloneableTarget=" + deepProtoType1.deepCloneableTarget.hashCode());

        //方式2 完成深拷贝
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();

        System.out.println("deepProtoType.name=" + deepProtoType.name + "deepProtoType.deepCloneableTarget=" + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println("deepProtoType2.name=" + deepProtoType2.name + "deepProtoType2.deepCloneableTarget=" + deepProtoType2.deepCloneableTarget.hashCode());
    }

}
