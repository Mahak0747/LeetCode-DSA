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
    private static int[] postOrder(TreeNode root){
        if(root==null)return new int[]{0,0};
        int[] l=postOrder(root.left);
        int[] r=postOrder(root.right);
        int avg=(l[0]+r[0]+root.val)/(l[1]+r[1]+1);
        if(root.val==avg)c++;
        return new int[]{l[0]+r[0]+root.val,l[1]+r[1]+1};
    }
    public int averageOfSubtree(TreeNode root) {
        c=0;
        postOrder(root);
        return c;
    }
}