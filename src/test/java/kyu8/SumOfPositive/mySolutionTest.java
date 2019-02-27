package kyu8.SumOfPositive;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
        assertEquals(15, mySolution.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, mySolution.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, mySolution.sum(new int[]{}));
        assertEquals(0, mySolution.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, mySolution.sum(new int[]{-1,2,3,4,-5}));
    }
}