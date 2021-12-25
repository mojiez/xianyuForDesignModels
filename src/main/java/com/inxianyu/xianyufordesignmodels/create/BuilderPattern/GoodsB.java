package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class GoodsB extends Goods {
    @Override
    public String name() {
        return "商品B";
    }

    @Override
    public String brand() {
        return "LiNing";
    }

    @Override
    public float price() {
        return 100f;
    }
}
