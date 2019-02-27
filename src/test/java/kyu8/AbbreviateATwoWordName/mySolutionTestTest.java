package kyu8.AbbreviateATwoWordName;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTestTest {
    @Test
    public void testFixed() {
        assertEquals("S.H", mySolution.abbrevName("Sam Harris"));
        assertEquals("P.F", mySolution.abbrevName("Patrick Feenan"));
        assertEquals("E.C", mySolution.abbrevName("Evan Cole"));
        assertEquals("P.F", mySolution.abbrevName("P Favuzzi"));
        assertEquals("D.M", mySolution.abbrevName("David Mendieta"));
    }
}