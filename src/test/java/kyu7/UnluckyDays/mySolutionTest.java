package kyu7.UnluckyDays;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
        assertEquals(3, mySolution.unluckyDays(2015));
        assertEquals(1, mySolution.unluckyDays(1986));
    }
}