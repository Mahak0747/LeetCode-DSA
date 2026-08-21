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
    static HashMap<Integer,Integer> map;
    private static void io(TreeNode root){
        if(root==null)return;
        io(root.left);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        io(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        map=new HashMap<>();
        io(root);
        return map.size()==1;
    }
}