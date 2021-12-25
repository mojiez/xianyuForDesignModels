package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class BrandFactory extends AbstractFactory {
    @Override
    public Type getType(String type) {
        return null;
    }
    @Override
    public Brand getBrand(String Brand) {
        if (Brand == null){
            return null;
        }
        if (Brand.equalsIgnoreCase("Adidas")){
            return new Adidas();
        }
        if (Brand.equalsIgnoreCase("LiNing")){
            return new LiNing();
        }
        if (Brand.equalsIgnoreCase("Midea")){
            return new Midea();
        }
        return null;
    }
}
