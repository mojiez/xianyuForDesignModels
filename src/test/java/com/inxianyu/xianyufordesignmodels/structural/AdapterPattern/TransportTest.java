package com.inxianyu.xianyufordesignmodels.structural.AdapterPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransportTest {
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
    public void mode() {
        Transport transport = new Transport();
        assertEquals("a||b",transport.Mode("a","a"));
    }

    @Test
    public void mode1(){
        Transport transport = new Transport();
        assertEquals("cc",transport.Mode("c","c"));
    }

    @Test
    public void mode2(){
        Transport transport = new Transport();
        assertEquals("not support",transport.Mode("1","1"));
    }
}