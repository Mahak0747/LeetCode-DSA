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
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode mid=getMid(head);
        ListNode rightH=mid.next;
        mid.next=null;
        ListNode final_L=sortList(head);
        ListNode final_R=sortList(rightH);
        return merge(final_L,final_R);
    }
    private ListNode getMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    private ListNode merge(ListNode leftLL,ListNode rightLL){
        ListNode ans=new ListNode(-1);
        ListNode temp=ans;
        while(leftLL!=null && rightLL!=null){
            if(leftLL.val <= rightLL.val){
                temp.next=leftLL;
                leftLL=leftLL.next;
                temp=temp.next;
            }
            else{
                temp.next=rightLL;
                rightLL=rightLL.next;
                temp=temp.next;                
            }
        }
        while(leftLL!=null){
            temp.next=leftLL;
            leftLL=leftLL.next;
            temp=temp.next;            
        }
        while(rightLL!=null){
            temp.next=rightLL;
            rightLL=rightLL.next;
            temp=temp.next;
        }
        return ans.next;
    }
}