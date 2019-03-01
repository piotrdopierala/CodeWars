package kyu8.TransportOnVacation;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void under3Tests() {
        assertEquals(40, mySolution.rentalCarCost(1));
        assertEquals(80, mySolution.rentalCarCost(2));
    }

    @Test
    public void under7Tests() {
        assertEquals(100, mySolution.rentalCarCost(3));
        assertEquals(140, mySolution.rentalCarCost(4));
        assertEquals(180, mySolution.rentalCarCost(5));
        assertEquals(220, mySolution.rentalCarCost(6));
    }

    @Test
    public void over7Tests() {
        assertEquals(230, mySolution.rentalCarCost(7));
        assertEquals(270, mySolution.rentalCarCost(8));
        assertEquals(310, mySolution.rentalCarCost(9));
        assertEquals(350, mySolution.rentalCarCost(10));
    }
}