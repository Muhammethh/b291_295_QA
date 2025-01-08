package com.myfirstSeleniumProject;

import org.junit.jupiter.api.*;

public class n01_day03_JUnitAnnotations {

    //@Test annotations bizim test case oluşturmamızı sağlar

    //Bu en çok kullandığımız test metotudur

    //@BeforeAll ve @AfterAll bunlar da bir kez çalışır before ve after her classta

    //@BeforeEach ve @AfterEach her bir text caseden önce ve bir kez ve sonra bir kez çalışır...

    //@BeforeAll

    @BeforeAll
    public static void setUpClass() {

        System.out.println("BEfore All");
    }

    @AfterAll
    public static void tearDownClass() {

        System.out.println("After All");

    }

    @BeforeEach
    public void setUpMethod() {
        System.out.println("Before each");

    }

    @AfterEach
    public void tearDownMethods() {

        System.out.println("After Each");

    }

    @Test
    public void Test01(){

        System.out.println("Test01");

    }

    @Test
    public void Test02(){

        System.out.println("Test02");

    }

    @Test
    public void Test03(){

        System.out.println("Test03");

    }

    @Test
    public void Test04(){

        System.out.println("Test04");

    }

    @Test
    public void Test05(){

        System.out.println("Test05");

    }

}
