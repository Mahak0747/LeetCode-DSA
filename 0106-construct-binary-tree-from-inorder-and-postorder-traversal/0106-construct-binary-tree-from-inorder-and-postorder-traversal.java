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
    private static TreeNode buildTree(int[] in,int inStart,int inEnd,int[] post,int postStart,int postEnd, HashMap<Integer,Integer> map){
        if(postStart>postEnd || inStart>inEnd)return null;
        TreeNode root=new TreeNode(post[postEnd]);
        int rootidx=map.get(post[postEnd]);
        int leftLen=rootidx-inStart;
        root.left=buildTree(in,inStart,rootidx-1,post,postStart,postStart+leftLen-1,map);
        root.right=buildTree(in,rootidx+1,inEnd,post,postStart+leftLen,postEnd-1,map);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length!=postorder.length)return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length; i++)map.put(inorder[i],i);
        return buildTree(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
    }
}