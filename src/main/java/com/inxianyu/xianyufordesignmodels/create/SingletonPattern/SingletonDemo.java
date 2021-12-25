package com.inxianyu.xianyufordesignmodels.create.SingletonPattern;

public class SingletonDemo {
    public static void main(String[] args) {
        CounterSingleton instance = CounterSingleton.getInstance();
        System.out.println("当前平台交易额为:"+instance.getCount());
        instance.addOne();
        System.out.println("当前平台交易额为:"+instance.getCount());
    }
}
