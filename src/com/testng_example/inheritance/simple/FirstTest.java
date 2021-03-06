package com.testng_example.inheritance.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:23 PM
 */
public class FirstTest {

    @BeforeClass
    public void setUp() {
        System.out.println("FirstTest: set up class");
    }

    @Test
    public void test11() {
        System.out.println("FirstTest: test11");
    }

    @Test
    public void test12() {
        System.out.println("FirstTest: test12");
    }

    @Test
    public void test13() {
        System.out.println("FirstTest: test13");
    }

    @Test
    public void test14() {
        System.out.println("FirstTest: test14");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("FirstTest: tear down class");
    }
}
