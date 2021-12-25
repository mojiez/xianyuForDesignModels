package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

public class QuanziUser extends observer{
    public QuanziUser(String name, QuanziSubscription account){
        this.name=name;
        this.subscriptAccount=account;

    }
    public String update(){
        System.out.printf("%s 已经获知公众号最新更新的内容：%s%n",name,subscriptAccount.getNews());
        return name+" 已经获知公众号最新更新的内容："+subscriptAccount.getNews()+"\n";
    }
}
