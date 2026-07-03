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
    private static int post(int[] max,TreeNode root){
        if(root==null)return 0;
        int l=Math.max(0,post(max,root.left));
        int r=Math.max(0,post(max,root.right));
        max[0]=Math.max(max[0],root.val+l+r);
        return root.val+Math.max(l,r);
    }
    public int maxPathSum(TreeNode root) {
        int[] ans=new int[1];
        ans[0]=Integer.MIN_VALUE;
        post(ans,root);
        return ans[0];
    }
}