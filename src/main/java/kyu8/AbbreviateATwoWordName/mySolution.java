package kyu8.AbbreviateATwoWordName;

import java.util.Arrays;

public class mySolution {
    public static String abbrevName(String name) {
        String[] words = name.toUpperCase().split(" ");
        return words[0].charAt(0)+"."+words[1].charAt(0);
    }
}
