package kyu8.ReversedSequence;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},mySolution.reverse(5));
    }
}