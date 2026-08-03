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
    private static void inorder(TreeNode root,ArrayList<Integer> l){
        if(root==null)return;
        inorder(root.left,l);
        l.add(root.val);
        inorder(root.right,l);
    }
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        inorder(root, l);
        int min=Integer.MAX_VALUE;
        for(int i=0; i<l.size()-1; i++){
            min=Math.min(min,Math.abs(l.get(i)-l.get(i+1)));
        }
        return min;
    }
}