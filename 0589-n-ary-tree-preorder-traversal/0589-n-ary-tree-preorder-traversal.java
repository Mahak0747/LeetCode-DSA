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
};
*/

class Solution {
    static List<Integer> ans;
    private static void pre(Node root){
        if(root==null)return;
        ans.add(root.val);
        for(Node n:root.children){
            pre(n);
        }
    }
    public List<Integer> preorder(Node root) {
        ans=new ArrayList<Integer>();
        pre(root);
        return ans;
    }
}