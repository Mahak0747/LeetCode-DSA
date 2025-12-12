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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode first=head;
        ListNode second=head.next;
        ListNode l=first;
        ListNode t=second;
        while(first.next!=null && second.next!=null){
            first.next=first.next.next;
            first=first.next;
            second.next=second.next.next;
            second=second.next;
        }
        first.next=t;
        return l;
    }
}