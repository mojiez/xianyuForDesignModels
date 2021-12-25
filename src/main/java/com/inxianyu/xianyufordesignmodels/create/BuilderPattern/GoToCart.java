package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

public class GoToCart {
    public static void main(String[] args) {
        ShoppingCartBuilder shoppingcartBuilder=new ShoppingCartBuilder();

        ShoppingCart Lining=shoppingcartBuilder.LiNing();
        System.out.println("LINING");
        Lining.showItems();
        System.out.println("Total Cost:"+Lining.getCost());

        ShoppingCart adidas=shoppingcartBuilder.Adidas();
        System.out.println("ADIDAS");
        adidas.showItems();
        System.out.println("Total Cost:"+adidas.getCost());

        ShoppingCart midea=shoppingcartBuilder.Midea();
        System.out.println("MIDEA");
        midea.showItems();
        System.out.println("Total Cost:"+midea.getCost());
    }
}
