package kyu7.ReverseWords;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void exampleCases() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", mySolution.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", mySolution.reverseWords("apple"));
        assertEquals("a b c d", mySolution.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", mySolution.reverseWords("double  spaced  words"));
    }
}