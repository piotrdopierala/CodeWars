package kyu8.CountingSheeps;

import java.util.Arrays;

public class mySolution {
    public int countSheeps(Boolean[] arrayOfSheeps) {
        return (int)Arrays.stream(arrayOfSheeps).filter(s->s!=null && s).count();
    }
}
