package kyu8.CountingSheeps;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    Boolean[] array1 = {true,  null,  true,  false,
            true,  true,  true,  true ,
            true,  false, true,  false,
            true,  false, false, true ,
            true,  true,  true,  true ,
            false, false, true,  true };

    @Test
    public void test() {
        assertEquals("There are 16 sheeps in total", 16, new mySolution().countSheeps(array1));
    }
}