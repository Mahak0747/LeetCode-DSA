/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null)return head;
        ListNode temp=new ListNode(-1);
        temp.next=head;
        ListNode prev=temp;
        ListNode curr=head;
        while(curr!=null&&curr.next!=null){
            if(curr.val==curr.next.val){
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next=curr.next;
            }
            else prev=prev.next;

            curr=curr.next;
        }
        return temp.next;
    }
}