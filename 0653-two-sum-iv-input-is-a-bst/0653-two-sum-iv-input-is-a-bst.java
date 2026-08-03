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
    private static void inorder(ArrayList<Integer> l, TreeNode root){
        if(root==null)return;
        inorder(l,root.left);
        l.add(root.val);
        inorder(l,root.right);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> in=new ArrayList<>();
        inorder(in,root);
        int l=0;
        int r=in.size()-1;
        while(l<r){
            if(in.get(l)+in.get(r)<k)l++;
            else if(in.get(l)+in.get(r)>k)r--;
            else return true;
        }
        return false;
    }
}