package kyu7.Repeater;

import java.util.stream.IntStream;

public class mySolution {
    public static String repeat(String string,long n){
        StringBuilder sb=new StringBuilder();
        IntStream.range(0,(int)n).forEach(p->sb.append(string));
        return sb.toString();
    }
}
