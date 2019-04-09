package kyu7.FindTheStrayNumner;

import java.util.Arrays;

public class cleverSolution {
    static int stray(int[] numbers) {
//        int n1 = 1;
//        int n2 = 2;
//        int res = n1 ^ n2;
//        System.out.println("n1 decimal:"+n1+" binary:"+Integer.toBinaryString(n1));
//        System.out.println("n2 decimal:"+n2+" binary:"+Integer.toBinaryString(n2));
//        System.out.println("res decimal:"+res+" binary"+Integer.toBinaryString(res));

        verboseStepByStep(numbers);

        int resFromReduce = Arrays.stream(numbers).reduce(0, (a, b) -> a ^ b);
        System.out.println("------------ result from reduce:"+resFromReduce+"----------");
        return resFromReduce;
    }

    static int verboseStepByStep(int[] numbers){
        int result=0;
        System.out.println("begin iteration result is first number");
        System.out.println("result:"+result);

        for (int i = 0; i <= numbers.length - 1; i++) {
            System.out.println("------ step no "+i+"---------");
            System.out.println("current result= "+result+" bin="+Integer.toBinaryString(result));
            System.out.println("number to apply= "+numbers[i]+" bin="+Integer.toBinaryString(numbers[i]));
            System.out.println("result^numbers[i]="+(result^numbers[i])+" bin="+Integer.toBinaryString((result^numbers[i])));
            result=(result^numbers[i]);
        }
        System.out.println("FINAL RESULT = "+result);
        return result;
    }
}
