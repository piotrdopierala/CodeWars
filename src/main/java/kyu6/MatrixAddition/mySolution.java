package kyu6.MatrixAddition;

import java.security.InvalidParameterException;

public class mySolution {
    public static int[][] matrixAddition(int[][] a, int[][] b) {
        if (!isMatrixSquare(a))
            throw new InvalidParameterException("Matrix a is empty or not don't have square size.");
        if (!isMatrixSquare(b))
            throw new InvalidParameterException("Matrix b is empty or not don't have square size.");
        if(a.length != b.length)
            throw new InvalidParameterException("Matrix a and b not the same size");

        int[][] returnMatrix = new int[a.length][a.length];

        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[0].length; col++) {
                returnMatrix[row][col] = a[row][col] + b[row][col];
            }
        }

        return returnMatrix;
    }

    private static boolean isMatrixSquare(int[][] a) {
        if (a == null) {
            return false;
        }

        int squareMatrixSize = a.length;

        if (squareMatrixSize == 0) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == null || a[i].length != squareMatrixSize) {
                return false;
            }
        }
        return true;
    }
}
