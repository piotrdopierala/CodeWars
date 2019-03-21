package kyu7.CapitalizeVowels;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {

    @Test
    public void swap_1() {
        assertEquals("HEllOWOrld!",mySolution.swap("HelloWorld!"));
    }

    @Test
    public void swap_2() {
        assertEquals("SUndAy",mySolution.swap("Sunday"));
    }
}