package kyu7.CienemaTicket;

public class mySolution {
    public static int movie(int card, int ticket, double perc) {
        double priceA=0.0;
        double priceB=card;
        int n=0;

        while(Math.ceil(priceB)>=priceA){
            n++;
            priceA=ticket*n;
            priceB=priceB+ticket*Math.pow(perc,n);
        }
        return n;
    }
}
