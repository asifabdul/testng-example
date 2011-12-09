package com.testng_example.inheritance.simple;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * User: asif
 * Date: 11/28/11
 * Time: 12:39 PM
 */
public class ThirdTest extends SecondTest {

    @BeforeClass
    public void setUp() {
        System.out.println("ThirdTest: set up class");
    }

    @AfterClass
    public void tearDown() {
        System.out.println("ThirdTest: tearDown class");
    }


    @Test
    public void test31() {
        System.out.println("ThirdTest: test31");
    }

    @Test
    public void test32() {
        System.out.println("ThirdTest: test32");
    }

    @Test
    public void test33() {
        System.out.println("ThirdTest: test33");
    }

    @Test
    public void test34() {
        System.out.println("ThirdTest: test34");
    }
}
