package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class GoodsA extends Goods{
    @Override
    public String name() {
        return "商品A";
    }

    @Override
    public String brand() {
        return "LiNing";
    }

    @Override
    public float price() {
        return 70f;
    }
}
