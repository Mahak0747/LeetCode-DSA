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
    static class Info{
        int dia;
        int hig;
        public Info(int d,int h){
            this.dia=d;
            this.hig=h;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
        // if (root == null) {
        //     return 0;
        // }
        // int dFromLeft = diameterOfBinaryTree(root.left);
        // int dFromRight = diameterOfBinaryTree(root.right);
        // int l = height(root.left);
        // int r = height(root.right);
        // int dFromRoot = l + r;
        // return Math.max(dFromRoot, Math.max(dFromLeft, dFromRight));
    }
    private Info diameter(TreeNode root){
        if (root == null)return new Info(0,-1);
        Info l = diameter(root.left);
        Info r = diameter(root.right);
        int h=Math.max(l.hig,r.hig)+1;
        int diaFromRoot=l.hig+r.hig+2;
        int d=Math.max(diaFromRoot,Math.max(l.dia,r.dia));
        return new Info(d,h);
    }
}