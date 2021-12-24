package com.inxianyu.xianyufordesignmodels.behavioral.command;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.security.acl.Group;

import static org.junit.Assert.*;

@RunWith(EasyMockRunner.class)
public class Group1Test {

    static int testnumber = 1;
    String GroupName = "";
    @Before
    public void setUp() throws Exception {
        System.out.println("test:"+testnumber+" starts..");
    }

    @After
    public void tearDown() throws Exception {
        testnumber++;
    }

    @Test
    public void publishing() {
        String id = "111";
        System.out.println("test for publish");
        GroupName = "hello";
        Group1 group1 = new Group1(GroupName);
        assertEquals((GroupName+"正在发布"+id),group1.publishing(id));
        System.out.println("Test"+testnumber+" Pass");
    }

    @Test
    public void notpublishing() {
        String id = "123";
        System.out.println("test for not publishing");
        GroupName = "world";
        Group1 group1 = new Group1(GroupName);
        assertEquals(GroupName+"取消发布"+id,group1.notpublishing(id));
        System.out.println("Test"+testnumber+" Pass");
    }
}