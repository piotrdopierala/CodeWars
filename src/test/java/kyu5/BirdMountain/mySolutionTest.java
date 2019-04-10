package kyu5.BirdMountain;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySolutionTest {
    @Test
    public void ex() {
        char[][] mountain = {
                "^^^^^^        ".toCharArray(),
                " ^^^^^^^^     ".toCharArray(),
                "  ^^^^^^^     ".toCharArray(),
                "  ^^^^^       ".toCharArray(),
                "  ^^^^^^^^^^^ ".toCharArray(),
                "  ^^^^^^      ".toCharArray(),
                "  ^^^^        ".toCharArray()
        };
        assertEquals(3, mySolution.peakHeight(mountain));
    }

    @Test
    public void thinIsland(){
        char[][] mountain = {
                "    ^^".toCharArray(),
                "  ^^  ".toCharArray(),
                " ^^^  ".toCharArray(),
                "   ^^^".toCharArray(),
                "  ^^  ".toCharArray(),
                " ^^^  ".toCharArray(),
                "^^^   ".toCharArray(),
                " ^^   ".toCharArray(),
                "   ^  ".toCharArray(),
                "   ^^^".toCharArray(),
                "   ^  ".toCharArray(),
                "  ^^^ ".toCharArray()
        };

        assertEquals(2, mySolution.peakHeight(mountain));
    }
}