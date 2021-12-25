package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public abstract class AbstractFactory {
    public abstract Type getType(String type);
    public abstract Brand getBrand(String Brand);
}
