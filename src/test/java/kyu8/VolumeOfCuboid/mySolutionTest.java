package kyu8.VolumeOfCuboid;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    private static final double delta = 0.0001;
    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, mySolution.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, mySolution.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}