package kyu7.MaxRotate;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test() {
        System.out.println("Fixed Tests maxRot");
        testing(mySolution.maxRot(56789),68957);
        testing(mySolution.maxRot(38458215), 85821534);
        testing(mySolution.maxRot(195881031), 988103115);
        testing(mySolution.maxRot(896219342), 962193428);
        testing(mySolution.maxRot(69418307), 94183076);
    }
}