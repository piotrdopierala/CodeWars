package kyu8.CenturyFromYear;

public class mySolution {
    public static int century(int number) {
        int base=(number/100);
        return number-(base*100)==0? base : base+1;
    }
}
