package com.testng_example.inheritance.alwaysrun;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:23 PM
 */
public class FirstTest {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.out.println("FirstTest: set up class");
    }

    @Test(groups = "GroupA")
    public void test11() {
        System.out.println("FirstTest: test11");
    }

    @Test(groups = "GroupB")
    public void test12() {
        System.out.println("FirstTest: test12");
    }

    @Test(dependsOnMethods = "test12")
    public void test13() {
        System.out.println("FirstTest: test13");
    }

    @Test(groups = {"GroupD"}, dependsOnMethods = "test13")
    public void test14() {
        System.out.println("FirstTest: test14");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("FirstTest: tear down class");
    }
}
