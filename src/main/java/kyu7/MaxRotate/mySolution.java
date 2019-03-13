package kyu7.MaxRotate;

public class mySolution {
    public static long maxRot(long n) {
        long maxValue = n;
        long actValue;
        StringBuilder text = new StringBuilder(Long.toString(n));

        for (int i = 0; i < text.length()-1; i++) {
            rotateLeft(text,i);
            actValue = Long.valueOf(text.toString());
            if (actValue > maxValue) {
                maxValue = actValue;
            }
        }
        return maxValue;
    }

    private static void rotateLeft(StringBuilder in, int constLeftCharsCount){
        StringBuilder partToRotate = new StringBuilder(in.substring(constLeftCharsCount));
        rotateLeft(partToRotate);
        in.delete(constLeftCharsCount,in.length());
        in.append(partToRotate);
    }

    private static void rotateLeft(StringBuilder in) {
        char charMoveToEnd = in.charAt(0);
        in.deleteCharAt(0);
        in.append(charMoveToEnd);
    }
}
