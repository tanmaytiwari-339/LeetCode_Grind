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
    public int distributeCoins(TreeNode root) {
        int[] n = helper(root);
        return n[1];
        
    }
    public int[] helper(TreeNode node){
        if(node==null){
            return new int[]{0,0};
        };
        int[] a = helper(node.left);
        int[] b = helper(node.right);
        int extra = node.val+a[0]+b[0]-1;
        int moves = a[1]+b[1]+Math.abs(a[0])+Math.abs(b[0]);
        return new int[]{extra,moves};

    }
}