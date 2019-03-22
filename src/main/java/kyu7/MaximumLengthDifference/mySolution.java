package kyu7.MaximumLengthDifference;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class mySolution {
    public static int mxdiflg(String[] a1, String[] a2) {
        if(a1==null || a2==null || a1.length==0 || a2.length==0){
            return -1;
        }
        IntSummaryStatistics a1Stats = Arrays.stream(a1).collect(Collectors.summarizingInt(String::length));
        IntSummaryStatistics a2Stats = Arrays.stream(a2).collect(Collectors.summarizingInt(String::length));

        return Math.max(Math.abs(a1Stats.getMax()-a2Stats.getMin()),Math.abs(a2Stats.getMax()-a1Stats.getMin()));
    }
}
