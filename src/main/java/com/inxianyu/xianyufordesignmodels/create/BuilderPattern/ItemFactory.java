package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class ItemFactory {
    public Item getItem(String name){
        if (name.equalsIgnoreCase("G1")){
            return new GoodsA();
        }else if (name.equalsIgnoreCase("G2")){
            return new GoodsB();
        }else if (name.equalsIgnoreCase("G3")){
            return new GoodsC();
        }else if (name.equalsIgnoreCase("G4")){
            return new GoodsD();
        }
        return null;
    }
}