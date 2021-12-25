package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public abstract class Goods implements Item {
    @Override
    public abstract String name();
    @Override
    public abstract float price();
    @Override
    public abstract String brand();
}
