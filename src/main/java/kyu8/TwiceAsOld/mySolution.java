package kyu8.TwiceAsOld;

public class mySolution {
    public static int TwiceAsOld(int dadYears, int sonYears){
        int dadYeasSonBorn=dadYears-sonYears;
        return Math.abs(dadYeasSonBorn-sonYears);
    }
}
