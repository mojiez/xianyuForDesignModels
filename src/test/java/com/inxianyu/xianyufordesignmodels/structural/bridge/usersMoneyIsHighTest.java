package com.inxianyu.xianyufordesignmodels.structural.bridge;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class usersMoneyIsHighTest {
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
    public void recommend() {
        usersAge usersage = new agesin60();
        usersMoneyIsHigh user1 = new usersMoneyIsHigh(usersage);

    }
}