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
    private static TreeNode buildTree(int[] in,int inStart,int inEnd,int[] pre, int preStart, int preEnd, HashMap<Integer,Integer> map){
        if(preStart>preEnd || inStart>inEnd) return null;
        TreeNode root=new TreeNode(pre[preStart]);
        int rootIdx=map.get(pre[preStart]);
        int leftLen=rootIdx-inStart;
        root.left=buildTree(in,inStart,inStart+leftLen-1,pre,preStart+1,preStart+leftLen,map);
        root.right=buildTree(in,rootIdx+1,inEnd,pre,preStart+leftLen+1,preEnd,map);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(inorder==null || preorder==null || inorder.length!=preorder.length)return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<inorder.length; i++)map.put(inorder[i],i);
        return buildTree(inorder,0,inorder.length-1,preorder,0,preorder.length-1,map);
    }
}