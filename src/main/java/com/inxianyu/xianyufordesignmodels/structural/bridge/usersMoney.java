package com.inxianyu.xianyufordesignmodels.structural.bridge;

public class usersMoney {
    private usersAge usersage;
    public usersMoney(usersAge usersage){
        this.usersage = usersage;
    }
    public void recommend(){
        usersage.recommend();
    }
}
