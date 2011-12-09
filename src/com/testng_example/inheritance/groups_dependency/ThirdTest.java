package com.testng_example.inheritance.groups_dependency;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:39 PM
 */
public class ThirdTest extends SecondTest {

    @BeforeClass(alwaysRun = true)
    public void setUp() {
        System.out.println("ThirdTest: set up class");
    }

    @Test(groups = "GroupA")
    public void test31() {
        System.out.println("ThirdTest: test31");
    }

    @Test(groups = "GroupB")
    public void test32() {
        System.out.println("ThirdTest: test32");
    }

    @Test(dependsOnMethods = "test32")
    public void test33() {
        System.out.println("ThirdTest: test33");
    }

    @Test(groups = {"GroupD"}, dependsOnMethods = "test33")
    public void test34() {
        System.out.println("ThirdTest: test34");
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
        System.out.println("ThirdTest: tear down class");
    }
}
