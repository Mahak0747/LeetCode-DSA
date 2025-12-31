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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode temp=head;
        int size=1;
        while(temp.next!=null){
            temp=temp.next;
            size++;
        }
        k=k%size;
        if(k==0)return head;
        int val=k%size;
        temp.next=head;
        int step=size-k;
        ListNode first=head;
        while(step>1){
            first=first.next;
            step--;
        }
        head=first.next;
        first.next=null;
        return head;
    }
}