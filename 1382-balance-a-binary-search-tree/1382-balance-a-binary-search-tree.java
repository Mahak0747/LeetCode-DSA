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
    private static void inorder(ArrayList<Integer> list,TreeNode root){
        if(root==null)return;
        inorder(list,root.left);
        list.add(root.val);
        inorder(list,root.right);
    }
    private static TreeNode balance(ArrayList<Integer> list,int l,int u){
        if(l>u)return null;
        int mid=(u+l)/2;
        TreeNode root=new TreeNode(list.get(mid));
        root.left=balance(list,l,mid-1);
        root.right=balance(list,mid+1,u);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> list=new ArrayList<>();
        inorder(list, root);
        return balance(list,0,list.size()-1);
    }
}