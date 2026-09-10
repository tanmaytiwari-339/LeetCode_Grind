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
    int count=0;
    int sum=0;
    int cou=0;
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
    public void helper(TreeNode node){
        if(node==null){
            return;
        }
        sum=0;
        cou=0;
        average(node);
        int avg = sum/cou;
        if(avg==node.val) count=count+1;
        helper(node.left);
        helper(node.right);
    }
    public void average(TreeNode root){
        if(root==null) return;
        sum=sum+root.val;
        cou=cou+1;
        average(root.left);
        average(root.right);
    }
}