package com.inxianyu.xianyufordesignmodels.create.BuilderPattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShoppingCartTest {
    static int testnumber = 1;
    @Before
    public void setUp() throws Exception {
        System.out.println("Test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test:"+testnumber+" ends..");
        testnumber++;
    }


    @Test
    public void getCost() {
        ShoppingCart shoppingCart = new ShoppingCart();

        Item item = new GoodsA();
        Item item1 = new GoodsB();
        shoppingCart.addItem(item);
        shoppingCart.addItem(item1);
        Assert.assertEquals(170,shoppingCart.getCost(),0);
    }

}