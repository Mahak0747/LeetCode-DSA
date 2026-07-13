/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    private static void findParent(TreeNode root,HashMap<TreeNode,TreeNode> parent){
        Queue<TreeNode> q=new LinkedList();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr.left!=null){
                q.add(curr.left);
                parent.put(curr.left,curr);
            }
            if(curr.right!=null){
                q.add(curr.right);
                parent.put(curr.right,curr);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        HashMap<TreeNode,TreeNode> parent=new HashMap<>();
        findParent(root,parent);
        HashSet<TreeNode> seen = new HashSet<>();
        Queue<TreeNode> q=new LinkedList();
        q.add(target);
        seen.add(target);
        int c=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(c==k)break;
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
        List<Integer> list=new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.remove().val);
        }
        return list;
    }
}