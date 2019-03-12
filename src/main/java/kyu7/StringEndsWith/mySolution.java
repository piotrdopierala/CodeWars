package kyu7.StringEndsWith;

public class mySolution {
    public static boolean solution(String str, String ending) {
        if(ending.length()>str.length())
            return false;
        return str.substring(str.length()-ending.length()).equals(ending);
    }
}
