package com.inxianyu.xianyufordesignmodels.behavioral.strategy;

public class Client {
    public static void main(String[] args) {
        Seller seller1 = new Seller();
        recommendStrategy normalStrategy = new normalStrategy();
        recommendStrategy lessStrategy = new lessStrategy();
        recommendStrategy moreStrategy = new moreStrategy();

        seller1.sell(1,1,lessStrategy);
        seller1.sell(10,10,normalStrategy);
        seller1.sell(100,100,moreStrategy);
    }
}
