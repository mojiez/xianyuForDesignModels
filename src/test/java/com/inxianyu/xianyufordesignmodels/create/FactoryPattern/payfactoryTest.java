package com.inxianyu.xianyufordesignmodels.create.FactoryPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class payfactoryTest {
    static int testnumber = 1;

    @Before
    public void setUp() throws Exception {
        System.out.println("Test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test:"+testnumber+" ends..");
    }

    @Test
    public void getpay() {
        payfactory payfactory = new payfactory();
        assertEquals(null,payfactory.getpay(null));
    }
}