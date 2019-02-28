package kyu7.UnluckyDays;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

public class mySolution {
    public static int unluckyDays(int year) {
        LocalDate firstDay = LocalDate.of(year, 01, 01);

        long count = IntStream.range(1, 12)
                .mapToObj(p->LocalDate.of(year,p,13))
                .filter(d->d.getDayOfWeek() == DayOfWeek.FRIDAY)
                .count();
        return (int) count;
    }
}
