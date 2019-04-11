package kyu6.SimpleTransposition;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

public class mySolution {
    public static String simpleTransposition(String text) {
        StringBuilder row1 = new StringBuilder();
        StringBuilder row2 = new StringBuilder();

        AtomicBoolean rowSwitch = new AtomicBoolean(true);

        Arrays.stream(text.split("")).forEach(c->{
            if(rowSwitch.get()){
                row1.append(c);
            }else{
                row2.append(c);
            }
            rowSwitch.set(!rowSwitch.get());
        });

        return row1.append(row2).toString();
    }
}
