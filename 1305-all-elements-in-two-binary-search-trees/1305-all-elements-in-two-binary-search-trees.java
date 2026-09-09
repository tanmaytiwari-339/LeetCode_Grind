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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        inOrder(root1,list1);
        inOrder(root2,list2);
        List<Integer> ans = new ArrayList<>();
        arrange(list1,list2,ans);
        return ans; 
    }
    public void inOrder(TreeNode node,List<Integer> arr){
        if(node==null) return;
        inOrder(node.left,arr);
        arr.add(node.val);
        inOrder(node.right,arr);
    }
    public void arrange(List<Integer> l1,List<Integer> l2,List<Integer> ans){
        int n1 = l1.size();
        int n2 = l2.size();
        int i=0;
        int j=0;
        while(i<n1 && j<n2){
            if(l1.get(i)<l2.get(j)){
                ans.add(l1.get(i));
                i++;
            }else{
                ans.add(l2.get(j));
                j++;
            }
        }
        while(i<n1){
            ans.add(l1.get(i));
            i++;
        }
        while(j<n2){
            ans.add(l2.get(j));
            j++;
        }
    }
}