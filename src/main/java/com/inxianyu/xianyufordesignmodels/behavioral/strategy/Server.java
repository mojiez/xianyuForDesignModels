package com.inxianyu.xianyufordesignmodels.behavioral.strategy;

public class Server {
    private recommendStrategy recommendstrategy;
    public void setRecommendstrategy(recommendStrategy recommendstrategy){
        this.recommendstrategy = recommendstrategy;
    }

    public void getSellStrategy(int credit,int dealcounts){
        recommendstrategy.getStrategy(credit,dealcounts);
    }

    public void getInfo(){
        recommendstrategy.getInfo();
    }
}
