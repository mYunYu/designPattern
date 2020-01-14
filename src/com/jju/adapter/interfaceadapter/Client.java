package com.jju.adapter.interfaceadapter;

public class Client {

    public static void main(String[] args) {
        AbsAdapter absAdapter = new AbsAdapter(){
            @Override
            public void m1() {
                System.out.println("执行了m1方法");
            }
        };

        absAdapter.m1();
    }

}
