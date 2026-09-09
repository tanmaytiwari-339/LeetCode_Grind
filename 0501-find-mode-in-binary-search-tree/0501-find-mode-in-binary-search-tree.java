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
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        inOrder(root,map);
        int[] arr = new int[map.size()];
        int max = Collections.max(map.values());
        int i=0;
        for(var entry : map.entrySet()){
            if(entry.getValue() == max){
                arr[i++] = entry.getKey();
            }
        }

        return Arrays.copyOf(arr,i);
        
    }
    public void inOrder(TreeNode node,HashMap<Integer,Integer> map){
        if(node==null) return;
        inOrder(node.left,map);
        map.put(node.val, map.getOrDefault(node.val, 0) + 1);
        inOrder(node.right,map);
    }
}