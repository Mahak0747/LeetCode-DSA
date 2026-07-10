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
 class Pair{
    TreeNode n;
    int idx;
    public Pair(TreeNode n, int idx){
        this.n=n;
        this.idx=idx;
    }
 }
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null)return 0;
        int ans=0;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int size=q.size();
            int mask=q.peek().idx;
            int l=-1;
            int r=-1;
            for(int i=0; i<size; i++){
                Pair curr=q.remove();
                int maskedIdx=curr.idx-mask;
                TreeNode currNode=curr.n;
                if(i==0)l=maskedIdx;
                if(i==size-1)r=maskedIdx;
                if(currNode.left!=null)q.add(new Pair(currNode.left,maskedIdx*2+1));
                if(currNode.right!=null)q.add(new Pair(currNode.right,maskedIdx*2+2));
            }
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}