package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

public class WechatUser extends observer{
    public WechatUser(String name,WechatSubscription account){
        this.name=name;
        this.subscriptAccount=account;

    }
    public void update(){
        System.out.printf("%s 已经获知公众号最新更新的内容：%s%n",name,subscriptAccount.getNews());
    }
}
