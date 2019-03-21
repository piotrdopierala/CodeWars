package kyu7.ExesAndOhs;

import java.util.Arrays;

public class mySolution {
    public static boolean getXO (String str) {
        int balance = Arrays.stream(str.split("")).mapToInt(p -> {
            p = p.toLowerCase();
            if (p.equals("x"))
                return 1;
            if (p.equals("o"))
                return -1;
            return 0;
        }).sum();

        return balance==0;
    }
}
