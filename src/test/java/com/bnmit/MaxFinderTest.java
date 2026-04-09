package com.bnmit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class MaxFinderTest {

    MaxFinder finder = new MaxFinder();

    @Test
    public void testMaxFirstIsLargest() {
        assertEquals(30, finder.findMax(30, 20, 10),
                "Should return 30 when first number is largest");
    }

    @Test
    public void testMaxSecondIsLargest() {
        assertEquals(50, finder.findMax(10, 50, 25),
                "Should return 50 when second number is largest");
    }

    @Test
    public void testMaxThirdIsLargest() {
        assertEquals(100, finder.findMax(10, 20, 100),
                "Should return 100 when third number is largest");
    }

    @Test
    public void testAllEqual() {
        assertEquals(5, finder.findMax(5, 5, 5),
                "Should return the number itself if all are equal");
    }

    @Test
    public void testCorrectedScenario() {
        assertEquals(10, finder.findMax(10, 2, 3),
                "Should return 10 as it is the largest");
    }

    @Test
    public void testNegativeAssertion() {
        assertNotEquals(2, finder.findMax(10, 2, 3),
                "Max should not be the smallest number");
    }
}