package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class GoodsC extends Goods {
    @Override
    public String name() {
        return "商品C";
    }

    @Override
    public String brand() {
        return "Adidas";
    }

    @Override
    public float price() {
        return 2195f;
    }
}
