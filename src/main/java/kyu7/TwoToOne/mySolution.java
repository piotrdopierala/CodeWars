package kyu7.TwoToOne;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class mySolution {
    public static String longest (String s1, String s2) {
        String stringsTogether = s1.concat(s2);
        return Stream.of(stringsTogether.split(""))
                .distinct()
                .sorted()
                .collect(Collectors.joining());
    }
}
