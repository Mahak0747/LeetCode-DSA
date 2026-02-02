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
    static ArrayList<Integer> list;
    private static void inOrder(TreeNode root){
        if(root==null)return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        list=new ArrayList<>();
        inOrder(root);
        for(int i=0; i<list.size()-1; i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }
}