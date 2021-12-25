package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class Adidas implements Brand {
    @Override
    public String Brand() {
        System.out.println("Brand:Adidas");
        return "Brand:Adidas";
    }
}
