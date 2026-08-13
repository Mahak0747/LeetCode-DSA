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
    private static void in(TreeNode root,ArrayList<Integer> l){
        if(root==null)return;
        in(root.left,l);
        l.add(root.val);
        in(root.right,l);
    }
    public int minDiffInBST(TreeNode root) {
        ArrayList<Integer> l=new ArrayList<>();
        in(root,l);
        int min=Integer.MAX_VALUE;
        for(int i=1; i<l.size(); i++){
            min=Math.min(l.get(i)-l.get(i-1),min);
        }
        return min;
    }
}