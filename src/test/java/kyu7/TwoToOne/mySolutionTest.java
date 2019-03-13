package kyu7.TwoToOne;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void test() {
        System.out.println("longest Fixed Tests");
        assertEquals("aehrsty", mySolution.longest("aretheyhere", "yestheyarehere"));
        assertEquals("abcdefghilnoprstu", mySolution.longest("loopingisfunbutdangerous", "lessdangerousthancoding"));
        assertEquals("acefghilmnoprstuy", mySolution.longest("inmanylanguages", "theresapairoffunctions"));
    }
}