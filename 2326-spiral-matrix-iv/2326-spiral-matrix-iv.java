/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {

        int[][] list = new int[m][n];
        int minRow = 0;
        int maxRow = m-1;
        int minCol = 0;
        int maxCol = n-1;
        ListNode temp = head;

        while(minRow<=maxRow && minCol<=maxCol){

            for(int j = minCol;j <= maxCol; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                if(temp==null){
                    list[minRow][j] = -1;
                }else{
                    list[minRow][j] = temp.val;
                    temp=temp.next;
                }
            }
            minRow++;

            for(int j = minRow;j <= maxRow; j++){
                if(minRow>maxRow || minCol>maxCol) return list;
                if(temp==null){
                    list[j][maxCol]= -1;
                }else{
                    list[j][maxCol]= temp.val;
                    temp=temp.next;
                }
            }
            maxCol--;

            for(int j = maxCol;j >= minCol; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                if(temp==null){
                    list[maxRow][j] = -1;
                }else{
                    list[maxRow][j] = temp.val;
                    temp=temp.next;
                }
            }
            maxRow--;

            for(int j = maxRow; j >= minRow; j--){
                if(minRow>maxRow || minCol>maxCol) return list;
                if(temp==null){
                    list[j][minCol] = -1;
                }else{
                    list[j][minCol] = temp.val;
                    temp=temp.next;
                }
            }
            minCol++;
        }
        return list;

    }
}