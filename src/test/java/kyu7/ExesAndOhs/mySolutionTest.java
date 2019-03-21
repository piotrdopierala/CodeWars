package kyu7.ExesAndOhs;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething1() {
        assertEquals(true, mySolution.getXO("xxxooo"));
    }

    @Test
    public void testSomething2() {
        assertEquals(true, mySolution.getXO("xxxXooOo"));
    }

    @Test
    public void testSomething3() {
        assertEquals(false, mySolution.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    public void testSomething4() {
        assertEquals(false, mySolution.getXO("xXxxoewrcoOoo"));
    }

    @Test
    public void testSomething5() {
        assertEquals(false, mySolution.getXO("XxxxooO"));
    }

    @Test
    public void testSomething6() {
        assertEquals(true, mySolution.getXO("zssddd"));
    }

    @Test
    public void testSomething7() {
        assertEquals(false, mySolution.getXO("Xxxxertr34"));
    }
}