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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean ltr=true;
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> comp=new ArrayList<>();
            for(int i=0; i<n; i++){
                TreeNode curr=q.remove();
                comp.add(curr.val);

                if(curr.left!=null)q.add(curr.left);
                if(curr.right!=null)q.add(curr.right);
            }
            if(!ltr)Collections.reverse(comp);
            ans.add(comp);
            ltr=!ltr;            
        }
        return ans;
    }
}