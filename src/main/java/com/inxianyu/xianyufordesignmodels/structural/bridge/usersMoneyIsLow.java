package com.inxianyu.xianyufordesignmodels.structural.bridge;

public class usersMoneyIsLow extends usersMoney{
    public usersMoneyIsLow(usersAge usersage) {
        super(usersage);
    }

    @Override
    public void recommend(){
        super.recommend();
        System.out.println("该用户为低收入人群");
    }
}
