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
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> node = new HashMap<>();
        Map<TreeNode, TreeNode> parent = new HashMap<>();
        TreeNode cur = null;
        for (int[] d : descriptions) {
            int p = d[0], c = d[1], isLeft = d[2];
            node.putIfAbsent(p, new TreeNode(p));
            node.putIfAbsent(c, new TreeNode(c));
            if (isLeft == 1) node.get(p).left = node.get(c);
            else node.get(p).right = node.get(c);
            parent.put(node.get(c), node.get(p));
            cur = node.get(p);
        }
        while (parent.containsKey(cur))cur = parent.get(cur);
        return cur;
    }
}