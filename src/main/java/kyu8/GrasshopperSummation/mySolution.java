package kyu8.GrasshopperSummation;

import java.util.stream.IntStream;

public class mySolution {
    public static int summation(int n) {
        return summation_progression(n);
    }

    public static int summation_progression(int n) {
        return n * (1 + n) >>1;
    }

    public static int summation_stream(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }

}
