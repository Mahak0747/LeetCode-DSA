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
    static int sum;
    private static void io(TreeNode root, int low, int high){
        if(root==null)return;
        io(root.left,low,high);
        if(root.val>=low && root.val<=high)sum+=root.val;
        io(root.right,low,high);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        io(root,low,high);
        return sum;
    }
}