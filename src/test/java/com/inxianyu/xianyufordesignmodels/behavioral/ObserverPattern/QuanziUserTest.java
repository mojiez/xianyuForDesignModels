package com.inxianyu.xianyufordesignmodels.behavioral.ObserverPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuanziUserTest {

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
    public void update() {
        QuanziSubscription quanziSubscription = new QuanziSubscription();
        String name = "A name";
        QuanziUser user = new QuanziUser(name, quanziSubscription);
        assertEquals(name+" 已经获知公众号最新更新的内容："+quanziSubscription.getNews()+"\n",user.update());
    }
}