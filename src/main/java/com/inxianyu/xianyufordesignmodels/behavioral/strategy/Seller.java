package com.inxianyu.xianyufordesignmodels.behavioral.strategy;

public class Seller {
    public void sell(int credit,int dealcounts,recommendStrategy... recommendstrategy){
        Server server = new Server();
        int newCredis = credit;
        int newDealcounts = dealcounts;
        for (recommendStrategy str : recommendstrategy){
            server.setRecommendstrategy(str);
            server.getInfo();
            server.getSellStrategy(newCredis,newDealcounts);
        }
    }
}
