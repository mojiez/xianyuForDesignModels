package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

public class observerDemo {
    public static void main(String[] args){
        WechatSubscription account=new WechatSubscription();
        observer user1=new WechatUser("Allen",account);
        observer user2=new WechatUser("Jack",account);
        observer user3=new WechatUser("Luck",account);

        account.attach(user1);
        account.attach(user2);
        account.attach(user3);

        account.updateNews("今日最低温-1°");

        account.detach(user1);
        account.updateNews("今日最低温-1°");
    }
}
