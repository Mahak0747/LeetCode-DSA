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
    static int c;
    private static int dfs(TreeNode root){
        if(root==null)return Integer.MIN_VALUE;
        int l=dfs(root.left);
        int r=dfs(root.right);
        int max=Math.max(root.val,Math.max(l,r));
        if(max==root.val)c++;
        return max;
    }
    public int countDominantNodes(TreeNode root) {
        c=0;
        dfs(root);
        return c;
    }
}