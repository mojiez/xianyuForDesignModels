package com.inxianyu.xianyufordesignmodels.structural.bridge;

public class usersMoneyIsMedium extends usersMoney{
    public usersMoneyIsMedium(usersAge usersage) {
        super(usersage);
    }

    @Override
    public void recommend(){
        super.recommend();
        System.out.println("该用户为中等收入人群");
    }
}
