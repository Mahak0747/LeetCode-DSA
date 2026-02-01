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
    static ArrayList<String> ans;
    private static void paths(TreeNode root,ArrayList<Integer> list){
        if(root==null)return;
        list.add(root.val);
        if(root.left==null&&root.right==null){
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<list.size(); i++){
                sb.append(list.get(i));
                if (i != list.size() - 1) sb.append("->");
            }
            ans.add(sb.toString());
        }
        else{
            paths(root.left,list);
            paths(root.right,list);
        }
        list.remove(list.size()-1);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        paths(root,new ArrayList<>());
        return ans;
    }
}