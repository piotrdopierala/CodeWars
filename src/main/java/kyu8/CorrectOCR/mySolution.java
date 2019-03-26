package kyu8.CorrectOCR;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class mySolution {

    static final Map<Character, Character> replaceDictionary;

    static {
        replaceDictionary = new HashMap<>();
        replaceDictionary.put('0', 'O');
        replaceDictionary.put('1', 'I');
        replaceDictionary.put('5', 'S');
    }

    public static String correct(String string) {
        return string.chars().mapToObj(p -> String.valueOf(replaceWithDictionary((char) p))).collect(Collectors.joining(""));
    }

    private static char replaceWithDictionary(char in) {
        return replaceDictionary.getOrDefault(in, in);
    }

}
