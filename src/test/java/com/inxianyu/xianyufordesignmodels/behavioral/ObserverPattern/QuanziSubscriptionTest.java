package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QuanziSubscriptionTest {
    static int testnumber;

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
    public void attach() {

    }

    @Test
    public void detach() {
    }

    @Test
    public void notifyUsers() {
    }
}