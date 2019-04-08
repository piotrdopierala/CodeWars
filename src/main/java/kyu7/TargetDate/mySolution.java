package kyu7.TargetDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class mySolution {
    private static final LocalDate START_DATE = LocalDate.of(2016,01,01);

    public static String dateNbDays(double a0, double a, double p) {
        double currentBallance=a0;
        int daysToTarget = 0;
        final LocalDate finalDate;
        final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        while(currentBallance<a) {
            currentBallance += currentBallance * (p / 36000);
            daysToTarget++;
        }

        finalDate = START_DATE.plusDays(daysToTarget);

        return dateFormatter.format(finalDate);
    }
}
