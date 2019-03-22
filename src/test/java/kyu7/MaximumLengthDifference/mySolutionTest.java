package kyu7.MaximumLengthDifference;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {

    @Test
    public void test() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(13, mySolution.mxdiflg(s1, s2)); // 13
    }

    @Test
    public void testNull() {
        System.out.println("mxdiflg Fixed Tests");
        String[] s1 = null;
        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
        assertEquals(-1, mySolution.mxdiflg(s1, s2)); // 13
    }
}