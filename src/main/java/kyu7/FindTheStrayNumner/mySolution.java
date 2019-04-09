package kyu7.FindTheStrayNumner;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class mySolution {
    static int stray(int[] numbers) {
        int commonNumber=findCommonNumber(numbers);
        OptionalInt strayNumber = Arrays.stream(numbers).filter(p -> p != commonNumber).findFirst();
        if(strayNumber.isPresent())
            return strayNumber.getAsInt();
        else
            return -1;
    }

    private static int findCommonNumber(int[] numbers){
        if(numbers[0]==numbers[1] || numbers[0] == numbers[2])
            return numbers[0];
        return numbers[1];
    }
}
