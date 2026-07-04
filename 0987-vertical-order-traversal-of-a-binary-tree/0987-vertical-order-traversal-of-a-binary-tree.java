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
    TreeNode n;
    int r;
    int c;
    public Info(TreeNode n, int r, int c){
        this.n=n;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Info> q=new LinkedList<>();
        q.add(new Info(root, 0, 0));
        while(!q.isEmpty()){
            Info curr=q.remove();
            TreeNode n=curr.n;
            int r=curr.r;
            int c=curr.c;
            map.putIfAbsent(c, new TreeMap<>());
            map.get(c).putIfAbsent(r, new PriorityQueue<>());
            map.get(c).get(r).add(n.val);
            if (curr.n.left != null) {
                q.add(new Info(curr.n.left, r+1, c-1));
            }
            if (curr.n.right != null) {
                q.add(new Info(curr.n.right, r+1, c+1));
            }
        }
        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> rows : map.values()) {
            List<Integer> list = new ArrayList<>();

            for (PriorityQueue<Integer> pq : rows.values()) {
                while (!pq.isEmpty()) {
                    list.add(pq.remove());
                }
            }
            ans.add(list);
        }
        return ans;
    }
}