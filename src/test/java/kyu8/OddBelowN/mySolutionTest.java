package kyu8.OddBelowN;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void fixedTests() {
        assertEquals(7, mySolution.oddCount(15));
        assertEquals(7511, mySolution.oddCount(15023));
    }
}