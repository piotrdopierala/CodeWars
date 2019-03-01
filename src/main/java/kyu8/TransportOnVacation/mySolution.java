package kyu8.TransportOnVacation;

public class mySolution {
    private static final int COST_PER_DAY=40;
    public static int rentalCarCost(int d) {
        int total = d*COST_PER_DAY;
        return total-rabate(d);
    }

    private static int rabate(int d){
        return d>=7?50:d>=3?20:0;
    }
}
