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
    private static ListNode merge(ListNode l1,ListNode l2){
        ListNode temp=new ListNode(-1);
        ListNode ptr=temp;
        while(l1!=null&&l2!=null){
            if(l1.val<=l2.val){
                ptr.next=l1;
                l1=l1.next;
            }
            else{
                ptr.next=l2;
                l2=l2.next;
            }
            ptr=ptr.next;
        }
        if(l1!=null)ptr.next=l1;
        if(l2!=null)ptr.next=l2;
        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)return null;
        ListNode ll=lists[0];
        for(int i=1; i<lists.length; i++){
            ll=merge(ll,lists[i]);
        }
        return ll;
    }
}