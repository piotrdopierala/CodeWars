package kyu8.GrasshopperSummation;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void test1() {
        assertEquals(1,
                mySolution.summation(1));
    }
    @Test
    public void test2() {
        assertEquals(36,
                mySolution.summation(8));
    }

}