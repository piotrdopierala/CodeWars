package kyu7.ReverseWords;

import java.util.Arrays;
import java.util.stream.Collectors;

public class mySolution {
    public static String reverseWords(final String original)
    {
        if(original.trim().length()==0)
            return original;
        return Arrays.stream(original.split(" ")).map(p->new StringBuilder(p).reverse()).collect(Collectors.joining(" "));

    }
}
