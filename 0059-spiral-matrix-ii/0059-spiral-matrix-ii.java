class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][] list = new int[n][n];
        int minRow = 0;
        int maxRow = n-1;
        int minCol = 0;
        int maxCol = n-1;
        int i = 1;
        while(minRow<=maxRow && minCol<=maxCol){

            for(int j = minCol;j <= maxCol; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                list[minRow][j] = i++;
            }
            minRow++;

            for(int j = minRow;j <= maxRow; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                list[j][maxCol]= i++;
            }
            maxCol--;

            for(int j = maxCol;j >= minCol; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                list[maxRow][j] = i++;
            }
            maxRow--;

            for(int j = maxRow; j >= minRow; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                list[j][minCol] = i++;
            }
            minCol++;
        }
        return list;
    
    }
}