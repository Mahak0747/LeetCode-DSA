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
    static TreeNode ans = new TreeNode(0);
    private static void incOrder(TreeNode root) {
        if (root == null) return;
        incOrder(root.left);
        ans.right = root;
        root.left = null;
        ans = ans.right;

        incOrder(root.right);
    }
    public TreeNode increasingBST(TreeNode root) {
        TreeNode head = ans;
        incOrder(root);

        return head.right;
    }
}