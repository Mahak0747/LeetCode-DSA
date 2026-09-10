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
    private static TreeNode postOrder(TreeNode root, int l, int sum){
        if(root==null)return null;
        if(root.left == null && root.right == null){
            return root.val + sum < l ? null : root;
        }
        root.left = postOrder(root.left, l, sum + root.val);
        root.right = postOrder(root.right, l, sum + root.val);
        return (root.left == null && root.right == null) ? null : root;
    }
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return postOrder(root,limit,0);
    }
}