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
class Info{
    int c;
    int r;
    int n;
    public Info(int n, int r, int c){
        this.c=c;
        this.r=r;
        this.n=n;
    }
}
class Solution {
    static ArrayList<Info> list;
    private static void postorder(TreeNode root, int r, int c){
        if(root==null)return;
        postorder(root.left,r+1,c-1);
        list.add(new Info(root.val, r, c));
        postorder(root.right,r+1,c+1);
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        list=new ArrayList<>();
        postorder(root,0,0);
        Collections.sort(list,(a,b)->{
            if (a.c != b.c) return a.c - b.c; // column
            if (a.r != b.r) return a.r - b.r; // row
            return a.n - b.n;                   // value
        });
        List<List<Integer>> ans = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;
        for (Info curr : list){
            if (curr.c != prevCol){
                ans.add(new ArrayList<>());
                prevCol = curr.c;
            }
            ans.get(ans.size() - 1).add(curr.n);
        }
        return ans;
    }
}