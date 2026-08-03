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
    private static void inorder(TreeNode root,HashMap<Integer,Integer> map){
        if(root==null)return;
        inorder(root.left,map);
        map.put(root.val,map.getOrDefault(root.val,0)+1);
        inorder(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        inorder(root,map);
        int max=0;
        for (int val : map.keySet()) {
            max = Math.max(max, map.get(val));
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for (int val : map.keySet()) {
            if (map.get(val) == max) {
                ans.add(val);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}