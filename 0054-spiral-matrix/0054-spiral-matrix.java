class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int minRow = 0;
        int maxRow = m;
        int minCol = 0;
        int maxCol = n;

        while(minRow<=maxRow && minCol<=maxCol){

            for(int j = minCol;j <= maxCol; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                list.add(matrix[minRow][j]);
            }
            minRow++;

            for(int j = minRow;j <= maxRow; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                list.add(matrix[j][maxCol]);
            }
            maxCol--;

            for(int j = maxCol;j >= minCol; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                list.add(matrix[maxRow][j]);
            }
            maxRow--;

            for(int j = maxRow; j >= minRow; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                list.add(matrix[j][minCol]);
            }
            minCol++;
        }
        return list;       
    }
}