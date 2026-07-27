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
    private static int i;
    private static TreeNode construct(int[] arr,int bound){
        if(i==arr.length || arr[i]>bound)return null;
        TreeNode NT=new TreeNode(arr[i++]);
        NT.left=construct(arr,NT.val);
        NT.right=construct(arr,bound);
        return NT;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0;
        return construct(preorder,Integer.MAX_VALUE);
    }
}