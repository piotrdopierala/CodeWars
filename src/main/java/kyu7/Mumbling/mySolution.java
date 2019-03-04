package kyu7.Mumbling;

import java.util.function.IntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class mySolution {
    public static String accum(String s) {

        return IntStream.range(0,s.length())
                .mapToObj(idx->{
                    StringBuilder sb = new StringBuilder();
                    char ch = Character.toLowerCase(s.charAt(idx));
                    sb.append(Character.toUpperCase(ch));
                    IntStream.range(0,idx).forEach(i->sb.append(ch));
                    return sb.toString();
                })
                .collect(Collectors.joining("-"));

    }




}

