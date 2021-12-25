package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class groupAdminDecoratorTest {
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
    public void sendMessage() {
        String message = "hello";
        groupMember groupmember = new normalMember();
        new groupAdminDecorator(groupmember,1);
        assertEquals(true,groupmember.sendMessage(message));
    }
}