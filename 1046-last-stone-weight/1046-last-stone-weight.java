class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue(Collections.reverseOrder());
        for(int i:stones)q.add(i);
        while(q.size() > 1){
            int val1=q.remove();
            int val2=q.remove();
            if(val1!=val2)q.add(val1-val2);
        }
        return q.isEmpty()?0:q.remove();
    }
}