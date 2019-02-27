package kyu8.EnoughSpaceInBus;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testBob() {
        assertEquals("Should return 0.", 0, mySolution.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, mySolution.enough(100, 60, 50));
    }
}