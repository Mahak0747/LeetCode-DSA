/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    static List<Integer> ans;
    private static void post(Node root){
        if(root==null)return;
        for(Node n:root.children){
            post(n);
        }
        ans.add(root.val);
    }
    public List<Integer> postorder(Node root) {
        ans=new ArrayList<Integer>();
        post(root);
        return ans;
    }
}