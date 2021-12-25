package com.inxianyu.xianyufordesignmodels.structural.ProxyPattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class realimageTest {
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
    public void display() {
        String fileName = "file1";
        realimage realimage = new realimage(fileName);
        assertEquals(fileName,realimage.display());
    }
}