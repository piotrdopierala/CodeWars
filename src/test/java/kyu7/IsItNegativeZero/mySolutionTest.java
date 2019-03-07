package kyu7.IsItNegativeZero;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    //private NegativeZeroValidator solution = new NegativeZeroValidator();

    @Test
    public void basic_tests() throws Exception {
        assertEquals("", mySolution.isNegativeZero(-0f), true);
        assertEquals("", mySolution.isNegativeZero(-5f), false);
        assertEquals("", mySolution.isNegativeZero(-4f), false);
        assertEquals("", mySolution.isNegativeZero(-3f), false);
        assertEquals("", mySolution.isNegativeZero(-2f), false);
        assertEquals("", mySolution.isNegativeZero(-1f), false);
        assertEquals("", mySolution.isNegativeZero(0f), false);
        assertEquals("", mySolution.isNegativeZero(1f), false);
        assertEquals("", mySolution.isNegativeZero(2f), false);
        assertEquals("", mySolution.isNegativeZero(3f), false);
        assertEquals("", mySolution.isNegativeZero(4f), false);
        assertEquals("", mySolution.isNegativeZero(5f), false);
    }
}