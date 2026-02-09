package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicTest {

    @Test
    public void testCaseOne() {
        System.out.println("Executing Test Case One");
        Assert.assertTrue(true, "Test Case One matches");
    }

    @Test
    public void testCaseTwo() {
        System.out.println("Executing Test Case Two");
        Assert.assertEquals(1 + 1, 2, "Test Case Two Math Check");
    }
}
