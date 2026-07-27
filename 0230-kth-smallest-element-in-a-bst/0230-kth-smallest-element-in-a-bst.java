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
    static int ans;
    private static void dfs(TreeNode root, int k){
        if(root.left!=null)dfs(root.left,k);
        c++;
        if(c==k){
            ans=root.val;
            return;
        }
        if(root.right!=null)dfs(root.right,k);
    }
    public int kthSmallest(TreeNode root, int k) {
        c=0;
        ans=0;
        dfs(root,k);
        return ans;
    }
}