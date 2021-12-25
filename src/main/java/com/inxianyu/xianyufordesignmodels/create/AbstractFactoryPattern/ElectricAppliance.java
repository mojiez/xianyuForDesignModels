package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;
public class ElectricAppliance implements Type {
    @Override
    public String type() {
        System.out.println("Type:ElectricAppliance");
        return  "Type:ElectricAppliance";
    }
}