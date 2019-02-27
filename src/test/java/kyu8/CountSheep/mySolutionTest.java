package kyu8.CountSheep;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
        assertEquals("1 sheep...", mySolution.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", mySolution.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", mySolution.countingSheep(3));
    }
}