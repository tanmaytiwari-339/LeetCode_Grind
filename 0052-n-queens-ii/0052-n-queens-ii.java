class Solution {
    int count=0;
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        queen(board,0);
        return count;

    }
    public void queen(boolean[][] board,int row){
        if(row==board.length){
            count++;
            return;
        }
        for(int col=0;col<board.length;col++){
            if(isSafe(board,row,col)){
                board[row][col]=true;
                queen(board,row+1);
                board[row][col]=false;
            }
            
        }
    }
    public boolean isSafe(boolean[][] board,int row,int col){
        //Lets check for vertical positon
        for(int i=1;i<=row;i++){
            if(board[row-i][col]) return false;
        }
        // Lets check for diagonal left
        int minLeft = Math.min(row,col);
        for(int k=1;k<=minLeft;k++){
            if(board[row-k][col-k]) return false;
        }

        //Lets check for the diagonal right

        int minRight = Math.min(row,board.length-col-1);
        for(int l=1;l<=minRight;l++){
            if(board[row-l][col+l]) return false;
        }
        return true;
    }
    
}