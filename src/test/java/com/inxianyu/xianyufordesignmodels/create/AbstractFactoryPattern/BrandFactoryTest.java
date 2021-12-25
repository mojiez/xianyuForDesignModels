package com.inxianyu.xianyufordesignmodels.create.AbstractFactoryPattern;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrandFactoryTest {

    static int testnumber=1;
    @Before
    public void setUp() throws Exception {
        System.out.println("Test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test:"+testnumber+"ends..");
        testnumber++;
    }

    @Test
    public void getType() {
        String type = "eletricity";
        BrandFactory brandFactory = new BrandFactory();
        assertEquals(null,brandFactory.getType(type));

    }

    @Test
    public void getBrand() {
        BrandFactory brandFactory = new BrandFactory();
        Adidas adidas = new Adidas();
        String Brand = "Adidas";
        Assert.assertNotEquals(adidas,brandFactory.getBrand(Brand));
    }
}