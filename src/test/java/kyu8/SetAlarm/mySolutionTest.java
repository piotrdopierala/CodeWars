package kyu8.SetAlarm;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void setAlarmTest() {
        assertTrue("Should be true.", mySolution.setAlarm(true, false));
        assertFalse("Should be false.", mySolution.setAlarm(true, true));
        assertFalse("Should be false.", mySolution.setAlarm(false, false));
        assertFalse("Should be false.", mySolution.setAlarm(false, true));
    }
}