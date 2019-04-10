package kyu5.BirdMountain;

public class mySolution {
    public static int peakHeight(char[][] mountain) {

        int[][] intMountain = toIntMap(mountain);
        int currentLevel = 0;
        boolean unmappedExists = true;
        boolean emptyMap=true;

        while(unmappedExists){
        unmappedExists=false;
        currentLevel++;
        for (int row=0;row<mountain.length;row++){
            for (int col = 0; col < mountain[0].length; col++) {
                if(intMountain[row][col]==-1){
                    emptyMap=false;
                    int lowestNeighbour =  lowestMappedNeighbour(intMountain, row, col);
                    if(lowestNeighbour==(currentLevel-1)){
                        intMountain[row][col] = lowestNeighbour+1;
                    }
                    else {
                        unmappedExists = true;
                    }
                }
            }
        }
        }
        return emptyMap? 0:currentLevel;
    }

    private static int lowestMappedNeighbour(int[][] mountain, int row, int col){
        int lowestNeighbour = Integer.MAX_VALUE;
        if(row==0 || col==0 || row==(mountain.length-1) || col==(mountain[row].length-1)){
            return lowestNeighbour=0;
        }

        int testElementValue;

        testElementValue=mountain[row-1][col];
        if(testElementValue!=-1 && testElementValue<lowestNeighbour)
            lowestNeighbour=mountain[row-1][col];

        testElementValue=mountain[row+1][col];
        if(testElementValue!=-1 && testElementValue<lowestNeighbour)
            lowestNeighbour=testElementValue;

        testElementValue=mountain[row][col-1];
        if(testElementValue!=-1 && testElementValue<lowestNeighbour)
            lowestNeighbour=testElementValue;

        testElementValue=mountain[row][col+1];
        if(testElementValue!=-1 && testElementValue<lowestNeighbour)
            lowestNeighbour=testElementValue;

        return lowestNeighbour;
    }

    private static int[][] toIntMap(char[][] mountain){
        int[][] intMountain = new int[mountain.length][];
        for (int row = 0; row < intMountain.length; row++) {
            intMountain[row] = new int[mountain[row].length];
            for (int col = 0; col < intMountain[row].length; col++) {
                if(mountain[row][col]==' ') {
                    intMountain[row][col] = 0;
                    continue;
                }
                if(mountain[row][col]=='^'){
                    intMountain[row][col] = -1; //unmapped terrain
                }
            }
        }
        return intMountain;
    }

}
