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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        if (root == null) return list;
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> l=new ArrayList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                list.add(l);
                l=new ArrayList<>();
                if(q.isEmpty())break;
                else q.add(null);                
            }
            else{
                l.add(curr.val);
                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
        }
        return list;
    }
}