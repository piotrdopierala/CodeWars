package kyu7.CapitalizeVowels;

import java.util.Arrays;

public class mySolution {
    public static String swap(String st){

        char[] chars = st.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (isVowel(ch)) {
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        return new String(chars);
    }

    private static boolean isVowel(char in){
        char[] vowels = {'a','e','i','o','u'};
        return Arrays.binarySearch(vowels,Character.toLowerCase(in))>=0;
    }
}
