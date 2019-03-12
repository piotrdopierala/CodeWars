package kyu8.CenturyFromYear;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void FixedTests() {
        assertEquals(18, mySolution.century(1705));
        assertEquals(19, mySolution.century(1900));
        assertEquals(17, mySolution.century(1601));
        assertEquals(20, mySolution.century(2000));
        assertEquals(1,  mySolution.century(89));
    }
}