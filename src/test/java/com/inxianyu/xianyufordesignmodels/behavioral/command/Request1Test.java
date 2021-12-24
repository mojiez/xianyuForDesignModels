package com.inxianyu.xianyufordesignmodels.behavioral.command;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(EasyMockRunner.class)
public class Request1Test {

    static int testnumber = 1;
    String name = "";
    HandleReceiver handle1 = new Group1(name);
    String id = "";
    Request1 request1 = new Request1(handle1,id);

    @Before
    public void setUp() throws Exception {
        System.out.println("test:"+testnumber+" begin..");
    }

//    @TestSubject
//    Request1 request1 = new Request1(handle,id);




    @After
    public void tearDown() throws Exception {
        testnumber++;
    }

    @Test
    public void executeCommand() {
        assertEquals("正在发布",request1.executeCommand());

    }

    @Test
    public void cancelCommand() {
        assertEquals("取消发布",request1.cancelCommand());
    }
}