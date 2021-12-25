package com.inxianyu.xianyufordesignmodels.behavioral.strategy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class lessStrategyTest {

    static int testnumber=1;
    @Before
    public void setUp() throws Exception {
        System.out.println("Test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Test:"+testnumber+" ends..");
    }

    @Test
    public void getStrategy() {
        lessStrategy lessStrategy = new lessStrategy();
        assertEquals("实行less推送策略..",lessStrategy.getStrategy(1,1));
    }

    @Test
    public void getInfo() {
        lessStrategy lessStrategy = new lessStrategy();
        assertEquals("当前推送策略为：less",lessStrategy.getInfo());
    }
}