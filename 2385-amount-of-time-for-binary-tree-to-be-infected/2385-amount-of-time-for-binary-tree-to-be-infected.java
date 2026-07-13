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
    private static TreeNode findParent(TreeNode root,HashMap<TreeNode,TreeNode> parent, int start){
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        TreeNode t=null;
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr.val==start)t=curr;
            if(curr.left!=null){
                q.add(curr.left);
                parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.add(curr.right);
                parent.put(curr.right,curr);
            }
        }
        return t;
    }
    public int amountOfTime(TreeNode root, int start) {
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        TreeNode target=findParent(root,parent,start);
        HashSet<TreeNode> seen = new HashSet<>();
        Queue<TreeNode> q=new LinkedList();
        q.add(target);
        seen.add(target);
        int c=-1;
        while(!q.isEmpty()){
            int size=q.size();
            c++;
            for(int i=0; i<size; i++){
                TreeNode curr=q.remove();
                if(curr.left!=null && !seen.contains(curr.left)){
                    q.add(curr.left);
                    seen.add(curr.left);
                }
                if(curr.right!=null && !seen.contains(curr.right)){
                    q.add(curr.right);
                    seen.add(curr.right);
                }
                if(parent.containsKey(curr) && !seen.contains(parent.get(curr))){
                    q.add(parent.get(curr));
                    seen.add(parent.get(curr));
                }
            }
        }
        return c;
    }
}