package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

public class observerDemo {
    public static void main(String[] args){
        QuanziSubscription account=new QuanziSubscription();
        observer user1=new QuanziUser("Allen",account);
        observer user2=new QuanziUser("Jack",account);
        observer user3=new QuanziUser("Luck",account);

        account.attach(user1);
        account.attach(user2);
        account.attach(user3);

        account.updateNews("今日最低温-1°");

        account.detach(user1);
        account.updateNews("今日最低温-1°");
    }
}
