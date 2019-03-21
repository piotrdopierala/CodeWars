package kyu8.ReversedSequence;

import java.util.stream.IntStream;

public class mySolution {
    public static int[] reverse(int n){

        return IntStream.rangeClosed(1,n).map(p->n-(p-1)).toArray();
    }
}
