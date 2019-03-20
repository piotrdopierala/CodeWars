package kyu8.WelcomeAPI;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void exampleTest() {
        assertEquals("Your function should have returned 'Welcome'. Try again.","Welcome", mySolution.greet("english"));
        assertEquals("Your function should have returned 'Welkom'. Try again.", "Welkom", mySolution.greet("dutch"));
        assertEquals("Your function should have returned 'Welcome'. Try again.", "Welcome", mySolution.greet("IP_ADDRESS_INVALID"));
    }
}