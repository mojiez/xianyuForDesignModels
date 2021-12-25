package com.inxianyu.xianyufordesignmodels.create.SingletonPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterSingletonTest {
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
    public void getCountAndAdd() {
        CounterSingleton counterSingleton = CounterSingleton.getInstance();
        counterSingleton.addOne();
        assertEquals(1,counterSingleton.getCount());
    }


}