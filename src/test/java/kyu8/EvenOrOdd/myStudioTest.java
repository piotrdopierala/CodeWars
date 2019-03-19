package kyu8.EvenOrOdd;

import org.junit.Test;

import static org.junit.Assert.*;

public class myStudioTest {
    @Test
    public void testEvenOrOdd() {
        mySolution eoo = new mySolution();
        assertEquals(eoo.even_or_odd(6), "Even");
        assertEquals(eoo.even_or_odd(7), "Odd");
    }
}