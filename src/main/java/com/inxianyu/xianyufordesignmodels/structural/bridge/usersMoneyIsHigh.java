package com.inxianyu.xianyufordesignmodels.structural.bridge;

public class usersMoneyIsHigh extends usersMoney{
    public usersMoneyIsHigh(usersAge usersage) {
        super(usersage);
    }

    @Override
    public void recommend(){
        super.recommend();
        System.out.println("该用户为高收入人群");
    }
}
