/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp=head;
        while(temp!=null){
            Node c=new Node(temp.val);
            c.next=temp.next;
            temp.next=c;
            temp=temp.next.next;
        }
        temp=head;
        while(temp!=null){
            Node c=temp.next;
            if(temp.random!=null)c.random=temp.random.next;
            temp=temp.next.next;
        }
        Node dummy=new Node(-1);
        temp=head;
        Node temp2=dummy;
        while(temp!=null){
            temp2.next=temp.next;
            temp2=temp2.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        return dummy.next;
    }
}