package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("TYPE")) {
            return new TypeFactory();
        } else if (factory.equalsIgnoreCase("BRAND")) {
            return new BrandFactory();
        }
        return null;
    }
}
