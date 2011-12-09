package com.testng_example.inheritance.groups_dependency;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:25 PM
 */
public class SecondTest extends FirstTest {

    @BeforeClass
    public void setUp() {
        System.out.println("SecondTest: set up class");
    }

    @Test(groups = "GroupA")
    public void test21() {
        System.out.println("SecondTest: test21");
    }

    @Test(groups = "GroupB")
    public void test22() {
        System.out.println("SecondTest: test22");
    }

    @Test(
            dependsOnGroups = "GroupD"
    )
    public void test23() {
        System.out.println("SecondTest: test23");
    }

    @Test(groups = "GroupD")
    public void test24() {
        System.out.println("SecondTest: test24");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("SecondTest: tear down class");
    }
}

