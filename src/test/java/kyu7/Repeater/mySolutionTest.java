package kyu7.Repeater;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
        assertEquals("aaaaa",mySolution.repeat("a",5));
        assertEquals("NaNaNaNaNaNaNaNaNaNaNaNaNaNaNaNa",mySolution.repeat("Na", 16));
        assertEquals("Wub Wub Wub Wub Wub Wub ",mySolution.repeat("Wub ", 6));
    }
}