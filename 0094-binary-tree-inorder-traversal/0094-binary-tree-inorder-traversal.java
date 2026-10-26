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
    public List<Integer> inorderTraversal(TreeNode root) {
       if(root==null) return list;
       inOrder(root) ;
       return list;
    }
    public TreeNode inOrder(TreeNode root){
        if(root==null) return null;
        TreeNode left = inOrder(root.left);
        list.add(root.val);
        return inOrder(root.right);

    }
    */

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        return list;



    }
    public void inOrder(TreeNode node, List<Integer> list){
        if(node==null) return;
        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);
    }

}