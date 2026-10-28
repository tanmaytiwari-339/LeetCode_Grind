/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    // Worst Case Time Complexity O(n^2)

    /*
    int max= Integer.MIN_VALUE;
    public int diameterOfBinaryTree(TreeNode root) {
        trav(root);
        return max;
        
    }
    public void trav(TreeNode node){
        if(node==null) return;
        trav(node.left);
        trav(node.right);
        int left = height(node.left);
        int right = height(node.right);
        max=Math.max(left+right,max);     
    }

    public int height(TreeNode node){
        if(node==null) return 0;
        return Math.max(height(node.left),height(node.right))+1;
    }
    */
    
    int diameter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        checkDia(root);
        return diameter-1;
        
    }
    public int checkDia(TreeNode node){

        if(node==null) return 0;
        int leftHeight = checkDia(node.left);
        int rightHeight = checkDia(node.right);
        int dia = leftHeight + rightHeight + 1;
        diameter = Math.max(dia,diameter); 
        return Math.max(leftHeight,rightHeight) + 1;
    }
}