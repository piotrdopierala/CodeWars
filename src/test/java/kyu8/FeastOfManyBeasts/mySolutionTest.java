package kyu8.FeastOfManyBeasts;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void fixedTest() {
        assertTrue(mySolution.feast("great blue heron","garlic nann"));
        assertTrue(mySolution.feast("chickadee","chocolate cake"));
        assertFalse(mySolution.feast("brown bear","bear claw"));
    }

}