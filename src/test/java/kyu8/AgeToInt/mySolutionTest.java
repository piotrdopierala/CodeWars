package kyu8.AgeToInt;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void test1() {
        assertEquals(5, mySolution.howOld("5 years old"));
    }
    @Test
    public void test2() {
        assertEquals(9, mySolution.howOld("9 years old"));
    }
    @Test
    public void test3() {
        assertEquals(1, mySolution.howOld("1 year old"));
    }
}