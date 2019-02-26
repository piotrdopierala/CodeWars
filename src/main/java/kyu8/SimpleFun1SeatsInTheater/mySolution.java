package kyu8.SimpleFun1SeatsInTheater;

public class mySolution {

    public static int seatsInTheater(int nCols, int nRows, int col, int row) {

        return (nCols-col+1)*(nRows-row);
    }

}
