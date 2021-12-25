package com.inxianyu.xianyufordesignmodels.behavioral.strategy;

public class moreStrategy implements recommendStrategy{
    @Override
    public String getStrategy(int credit, int discount) {
        System.out.println("实行more推送策略...");
        return "实行more推送策略...";
    }

    @Override
    public String getInfo() {
        System.out.println("当前推送策略为：more");
        return "当前推送策略为：more";
    }
}
