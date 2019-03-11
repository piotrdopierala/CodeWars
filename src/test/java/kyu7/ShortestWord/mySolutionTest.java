package kyu7.ShortestWord;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void findShort() throws Exception {
        assertEquals(3, mySolution.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, mySolution.findShort("turns out random test cases are easier than writing out basic ones"));
    }

}