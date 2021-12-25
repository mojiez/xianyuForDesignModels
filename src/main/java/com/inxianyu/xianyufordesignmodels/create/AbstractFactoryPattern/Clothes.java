package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class Clothes implements Type {
    @Override
    public String type() {
        System.out.println("Type:Clothes");
        return "Type:Clothes";
    }
}
