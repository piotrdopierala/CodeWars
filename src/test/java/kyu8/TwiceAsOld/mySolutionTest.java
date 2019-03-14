package kyu8.TwiceAsOld;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
        assertEquals(30, mySolution.TwiceAsOld(30,0));
        assertEquals(16, mySolution.TwiceAsOld(30,7));
        assertEquals(15, mySolution.TwiceAsOld(45,30));
    }
}