package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;
public class TypeFactory extends AbstractFactory {
    @Override
    public Type getType(String type) {
        if (type == null) {
            return null;
        }
        if (type.equalsIgnoreCase("Clothes")) {
            return new Clothes();
        }
        if (type.equalsIgnoreCase("ElectricAppliance")) {
            return new ElectricAppliance();
        }
        return null;
    }

    @Override
    public Brand getBrand(String Brand) {
        return null;
    }
}
