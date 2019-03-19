package kyu8.AreYouPlayingBanjo;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void PeopleThatPlayBanjo() {
        assertEquals( "Nope!" , mySolution.areYouPlayingBanjo("Martin"), "Martin does not play banjo");
        assertEquals( "Nope!" , mySolution.areYouPlayingBanjo("Rikke"), "Rikke plays banjo");
    }
}