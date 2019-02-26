package kyu8.TotalAmountOfPoints;

import java.util.Arrays;

public class mySolution {
    public static int points(String[] games) {
        int sum = Arrays.stream(games).mapToInt(res -> {
            String[] points = res.split(":");
            int result = Integer.parseInt(points[0]) - Integer.parseInt(points[1]);
            return result > 0 ? 3 : result < 0 ? 0 : 1;
        }).sum();
        return sum;
    };
}
