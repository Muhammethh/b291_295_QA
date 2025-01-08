package com.myfirstSeleniumProject;

import org.checkerframework.checker.units.qual.A;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class n02_day03_JUnitAssertions {

    @Test
    public void assertions(){

        Assertions.assertEquals(5,5); //Passed

    }

    @Test
    public void assertEquals(){

        Assertions.assertEquals("apple","APPLE".toLowerCase());

    }

    @Test
    public void assertEquals02(){

        Assertions.assertEquals(5.12,5.12);

    }

    @Test
    public void assertEquals03(){

        Assertions.assertTrue(10>8);

    }

    @Test
    public void assertEquals04(){

        Assertions.assertTrue(5>6); //bu false çıkar bir sonrakine bakmaz
        Assertions.assertTrue(5==5);

        Assertions.assertTrue(3>5);

        //fail olan satırdan sonrasını kontrol etmez


        String str = null;

        Assertions.assertNull(str);

    }

    @Test
    public void assertNull(){


        String str = null;

        Assertions.assertNull(str);

        Assertions.assertFalse("Java".contains("Techpro"));
    }

}
