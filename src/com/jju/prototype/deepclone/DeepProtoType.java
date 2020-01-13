package com.jju.prototype.deepclone;

import java.io.*;

public class DeepProtoType implements Serializable, Cloneable {

    public String name;     //String属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型
    public DeepProtoType(){
        super();
    }


    //深拷贝 --- 方式1 使用clone方法
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        //完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        //对引用类型的属性，进行单独处理
        DeepProtoType deepProtoType = (DeepProtoType) deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();

        return deepProtoType;
    }

    //深拷贝 --- 方式2 通过对象的序列化实现（推荐）
    public Object deepClone(){
        //创建流对象
        ByteArrayOutputStream byteArrayOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        ByteArrayInputStream byteArrayInputStream = null;
        ObjectInputStream objectInputStream = null;

        try{
            //序列化
            byteArrayOutputStream = new ByteArrayOutputStream();
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(this);           //当前这个对象以对象流的方式输出

            //反序列化
            byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            DeepProtoType copyObj = (DeepProtoType) objectInputStream.readObject();

            return copyObj;
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }finally {
            //关闭流
            try{
                byteArrayOutputStream.close();
                objectOutputStream.close();
                byteArrayInputStream.close();
                objectInputStream.close();
            }catch (Exception e2){
                System.out.println(e2.getMessage());
            }
        }

    }

}
