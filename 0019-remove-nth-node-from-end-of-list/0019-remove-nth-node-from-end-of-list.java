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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp=head;
        int s=0;
        while(temp!=null){
            s++;
            temp=temp.next;
        }
        if(n==s){
            return head.next;
        }
        int i=1;
        int basecase=s-n;
        ListNode prev=head;
        while(i<basecase){
            i++;
            prev=prev.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}