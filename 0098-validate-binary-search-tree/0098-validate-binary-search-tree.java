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
    private static boolean find(TreeNode root,TreeNode min,TreeNode max){
        if(root==null)return true;
        else if(min!=null&&min.val>=root.val)return false;
        else if(max!=null&&max.val<=root.val)return false;
        return find(root.left, min, root)&& find(root.right, root, max);
    }
    public boolean isValidBST(TreeNode root) {
        return find(root,null,null);
    }
}