package kyu8.AgeToInt;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class mySolution {
    public static int howOld(final String herOld) {
        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher findNumbers = numberPattern.matcher(herOld);
        if (findNumbers.find()) {
            return Integer.parseInt(findNumbers.group());
        } else {
            return 0;
        }
    }
}
