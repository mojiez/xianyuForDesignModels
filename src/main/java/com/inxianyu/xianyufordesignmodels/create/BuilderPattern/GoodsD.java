package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class GoodsD extends Goods{
    @Override
    public String name() {
        return "商品D";
    }

    @Override
    public String brand() {
        return "Midea";
    }

    @Override
    public float price() {
        return 40000f;
    }
}
