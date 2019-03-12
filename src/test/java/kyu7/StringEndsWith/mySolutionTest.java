package kyu7.StringEndsWith;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void testSomething() {
         assertTrue(mySolution.solution("Ala ma kota","kota"));
         assertTrue(mySolution.solution("abcde","e"));
         assertTrue(mySolution.solution("kabel","kabel"));
         assertFalse(mySolution.solution("kabel","al"));
         assertFalse(mySolution.solution("Ala ma kota","wkota"));
         assertFalse(mySolution.solution("woda","abcdwoda"));
    }
}