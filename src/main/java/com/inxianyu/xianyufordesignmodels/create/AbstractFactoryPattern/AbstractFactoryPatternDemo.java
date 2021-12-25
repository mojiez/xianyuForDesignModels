package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory factory = null;

        factory = FactoryProducer.getFactory("type");
        Type type=factory.getType("clothes");
        type.type();
        type=factory.getType("ElectricAppliance");
        type.type();

        factory = FactoryProducer.getFactory("brand");
        Brand brand=factory.getBrand("adidas");
        brand.Brand();
        brand=factory.getBrand("lining");
        brand.Brand();
        brand=factory.getBrand("Midea");
        brand.Brand();
    }
}
