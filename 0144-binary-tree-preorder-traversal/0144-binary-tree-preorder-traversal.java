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
    /*
    List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null) return list;
        pre(root);
        return list;

        
    }
    public TreeNode pre(TreeNode root){
        if(root == null) return null;
        list.add(root.val);
        TreeNode left = pre(root.left);
        return pre(root.right);
    }
    */
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root,list);
        return list;
    }

    public void preOrder(TreeNode node, List<Integer> list){
        if(node==null) return;
        list.add(node.val);
        preOrder(node.left,list);
        preOrder(node.right,list);
    }
    
}