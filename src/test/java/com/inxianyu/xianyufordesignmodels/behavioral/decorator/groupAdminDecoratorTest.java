package com.inxianyu.xianyufordesignmodels.behavioral.decorator;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class groupAdminDecoratorTest {
    static int testnumber;
    normalMember member = new normalMember();
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
    }
}