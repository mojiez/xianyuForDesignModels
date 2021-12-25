package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class normalMemberTest {

    static int testnumber=1;
    @Before
    public void setUp() throws Exception {
        System.out.println("test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        testnumber++;
    }

    @Test
    public void sendMessage() {
        String message = "";
        normalMember normalmember = new normalMember();
        assertEquals(true,normalmember.sendMessage(message));
    }

    @Test
    public void quitGroup() {
        normalMember member = new normalMember();
        assertEquals(true,member.quitGroup());
    }

    @Test
    public void getMessage() {
        String msg = "";
        normalMember member = new normalMember();
        assertEquals(true,member.getMessage(msg));
    }
}