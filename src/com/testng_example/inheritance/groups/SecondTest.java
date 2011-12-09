package com.testng_example.inheritance.groups;

import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:25 PM
 */
public class SecondTest extends FirstTest {

    @Test(groups = "GroupA")
    public void test21() {
        System.out.println("SecondTest: test21");
    }

    @Test(groups = "GroupB")
    public void test22() {
        System.out.println("SecondTest: test22");
    }

    @Test
    public void test23() {
        System.out.println("SecondTest: test23");
    }

    @Test(groups = "GroupD")
    public void test24() {
        System.out.println("SecondTest: test24");
    }

}

