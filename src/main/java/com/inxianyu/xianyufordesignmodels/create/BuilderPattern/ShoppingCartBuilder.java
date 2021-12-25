package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;



public class ShoppingCartBuilder {
    public ShoppingCart LiNing(){
        ShoppingCart LiNing=new ShoppingCart();
        LiNing.addItem(new GoodsA());
        LiNing.addItem(new GoodsB());
        return  LiNing;
    }
    public ShoppingCart Adidas(){
        ShoppingCart LiNing=new ShoppingCart();
        LiNing.addItem(new GoodsC());
        return  LiNing;
    }
    public ShoppingCart Midea(){
        ShoppingCart LiNing=new ShoppingCart();
        LiNing.addItem(new GoodsD());
        return  LiNing;
    }
}
