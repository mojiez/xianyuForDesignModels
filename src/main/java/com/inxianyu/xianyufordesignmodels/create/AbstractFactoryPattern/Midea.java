package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class Midea implements Brand {
    @Override
    public String Brand() {
        System.out.println("Brand:Midea");
        return "Brand:Midea";
    }
}
