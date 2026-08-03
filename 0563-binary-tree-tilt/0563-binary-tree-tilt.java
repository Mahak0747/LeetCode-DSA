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
    static int ans;
    private static int postorder(TreeNode root){
        if(root==null)return 0;
        int l=postorder(root.left);
        int r=postorder(root.right);
        ans+=Math.abs(l-r);
        return l+r+root.val;
    }
    public int findTilt(TreeNode root) {
        ans=0;
        postorder(root);
        return ans;
    }
}