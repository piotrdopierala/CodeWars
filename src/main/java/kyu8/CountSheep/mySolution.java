package kyu8.CountSheep;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mySolution {
    public static String countingSheep(int num) {
        return  IntStream.range(1, num + 1).mapToObj(no -> Integer.toString(no) + " sheep...").collect(Collectors.joining());
    }
}
