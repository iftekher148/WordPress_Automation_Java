package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DifferentAssertion {
    @Test
    public void testHardAssertion(){
        //Hard Assertion
       // Assert.assertTrue(true);
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        Assert.assertTrue(false);
        System.out.println("Hello 3");
        System.out.println("Hello 4");

    }
    @Test
    public void testSoftAssert(){
        SoftAssert softAssert = new SoftAssert();
        //softAssert.assertTrue(false);
        System.out.println("Hello 1");
        System.out.println("Hello 2");
        softAssert.assertTrue(false);
        System.out.println("Hello 3");
        System.out.println("Hello 4");
        softAssert.assertAll();
    }
}
