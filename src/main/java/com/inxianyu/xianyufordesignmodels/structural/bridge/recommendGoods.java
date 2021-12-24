package com.inxianyu.xianyufordesignmodels.structural.bridge;

public class recommendGoods {
    public static void main(String[] args) {
        System.out.println("想要推送给40-60岁高收入人群..");
        usersMoney methods1 = new usersMoneyIsHigh(new agesin60());
        methods1.recommend();
        System.out.println("推送策略成功执行");
        System.out.println();

        System.out.println("想要推送给0-20岁低收入人群..");
        methods1 = new usersMoneyIsLow(new agesin20());
        methods1.recommend();
        System.out.println("推送策略成功执行");
        System.out.println();

        System.out.println("想要推送给20-40岁中等收入人群..");
        methods1 = new usersMoneyIsMedium(new agesin40());
        methods1.recommend();
        System.out.println("推送策略成功执行");
        System.out.println();
    }
}
