package kyu7.FindTheStrayNumner;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class mySolutionTest {
    @Test
    public void simpleArray1() {
        assertEquals(3, getActualFor(1, 3, 1));
    }

    private int getActualFor(int... numbers) {
        return cleverSolution.stray(numbers);
    }

}