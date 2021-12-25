package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class groupAdminDecoratorTest {
<<<<<<< HEAD
    static int testnumber;
    normalMember member = new normalMember();
    @Before
    public void setUp() throws Exception {
        System.out.println("test:"+testnumber+" starts..");
=======
    static int testnumber=1;

    @Before
    public void setUp() throws Exception {
        System.out.println("Test:"+testnumber+" starts..");
>>>>>>> 5f399225212fdcd56a6813a5837ff739ba1e4877
    }

    @After
    public void tearDown() throws Exception {
<<<<<<< HEAD
        testnumber++;
=======
        System.out.println("Test:"+testnumber+" ends..");
>>>>>>> 5f399225212fdcd56a6813a5837ff739ba1e4877
    }

    @Test
    public void sendMessage() {
<<<<<<< HEAD
        int id = 123;
        String msg = "";
        groupAdminDecorator admin = new groupAdminDecorator(member,id);
        assertEquals(true,admin.sendMessage(msg));
    }

    @Test
    public void withmark() {
        int id = 111;
        String msg = "";
        groupAdminDecorator admin = new groupAdminDecorator(member,id);
        assertEquals("管理员的id为:"+id,admin.TestWithMark());
    }

    @Test
    public void deleteMember(){
        int id = 111;
        String msg = "";
        groupAdminDecorator admin = new groupAdminDecorator(member,id);
        assertEquals("删除了一位成员..",admin.TestDelete());
    }

    @Test
    public void addMember(){
        int id = 111;
        String msg = "";
        groupAdminDecorator admin = new groupAdminDecorator(member,id);
        assertEquals("添加了一位成员..",admin.TestAdd());
=======
        String message = "hello";
        groupMember groupmember = new normalMember();
        new groupAdminDecorator(groupmember,1);
        assertEquals(true,groupmember.sendMessage(message));
>>>>>>> 5f399225212fdcd56a6813a5837ff739ba1e4877
    }
}