package kyu7.ShortestWord;

import java.util.Arrays;

public class mySolution {
    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).mapToInt(String::length).min().getAsInt();
    }
}
