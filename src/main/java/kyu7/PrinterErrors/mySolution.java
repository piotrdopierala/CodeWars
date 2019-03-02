package kyu7.PrinterErrors;


public class mySolution {
    private static final int SMALL_A_ASCII_CODE = 97;
    private static final int SMALL_M_ASCII_CODE = 109;

    public static String printerError(String s) {
        long count = s.chars().filter(p -> p < SMALL_A_ASCII_CODE || p > SMALL_M_ASCII_CODE).count();
        return ""+count+"/"+s.length();
    }
}
