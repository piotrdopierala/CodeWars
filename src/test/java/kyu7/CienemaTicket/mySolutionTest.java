package kyu7.CienemaTicket;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        System.out.println("Fixed Tests: movie");
        testing(mySolution.movie(500, 15, 0.9), 43);
        testing(mySolution.movie(100, 10, 0.95), 24);
    }
}