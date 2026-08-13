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
    private void leaf(TreeNode root, ArrayList<Integer> l) {
        if (root == null) return;
        if (root.left == null && root.right == null) {
            l.add(root.val);
            return;
        }
        leaf(root.left, l);
        leaf(root.right, l);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        leaf(root1, l1);
        leaf(root2, l2);
        return l1.equals(l2);
    }
}