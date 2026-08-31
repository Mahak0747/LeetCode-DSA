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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> list=new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        ArrayList<Integer> cp=new ArrayList<>();
        for(int i=1; i<list.size()-1; i++){
            if(list.get(i)>list.get(i - 1) && list.get(i) > list.get(i + 1))cp.add(i);
            else if(list.get(i)<list.get(i - 1) && list.get(i) < list.get(i + 1))cp.add(i);
        }
        if(cp.size()<2)return new int[]{-1,-1};
        int max=cp.get(cp.size()-1)-cp.get(0);
        int min=Integer.MAX_VALUE;
        for(int i=1; i<cp.size(); i++){
            min=Math.min(min,cp.get(i)-cp.get(i-1));
        }
        return new int[]{min,max};
    }
}