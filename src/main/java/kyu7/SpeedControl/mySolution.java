package kyu7.SpeedControl;

import java.util.Arrays;
import java.util.OptionalDouble;

public class mySolution {
    public static int gps(int s, double[] x) {
        double speed[] = new double[x.length-1];

        for (int i = 0; i < x.length-1; i++) {
            speed[i]=(3600*(x[i+1]-x[i]))/s;
        }
        OptionalDouble max = Arrays.stream(speed).max();
        int floor = (int)Math.floor(max.orElse(0.0));

        return floor;
    }
}
