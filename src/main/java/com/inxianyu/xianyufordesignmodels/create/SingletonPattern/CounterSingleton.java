package com.inxianyu.xianyufordesignmodels.create.SingletonPattern;

public class CounterSingleton {
    private static CounterSingleton instance;
    private int count = 0;
    private CounterSingleton(){}
    public synchronized static CounterSingleton getInstance(){
        if(instance==null){
            System.out.println("交易量统计开始。");
            instance=new CounterSingleton();
        }
        return instance;
    }
    public int getCount(){
        return count;
    }
    public void addOne(){
        this.count++;
        System.out.println("交易量+1，目前完成交易次数："+count);
    }
}
