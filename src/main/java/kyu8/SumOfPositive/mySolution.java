package kyu8.SumOfPositive;

import java.util.Arrays;
import java.util.stream.IntStream;

public class mySolution {
    public static int sum(int[] arr){
        return IntStream.of(arr).filter(p->p>0).sum();
    }
}
