class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n=nums.length;
        Deque<Integer> min=new ArrayDeque<>();
        Deque<Integer> max=new ArrayDeque<>();
        long c=0;
        int l=0;
        for(int right=0; right<n; right++){
            while(!min.isEmpty()&&nums[min.peekLast()]>nums[right]){
                min.removeLast();
            }
            min.addLast(right);
            while(!max.isEmpty()&&nums[max.peekLast()]<nums[right]){
                max.removeLast();
            }
            max.addLast(right);
            while((long)(nums[max.peekFirst()]-nums[min.peekFirst()])*(right-l+1)>k){
                if(min.peekFirst()==l)min.removeFirst();
                if(max.peekFirst()==l)max.removeFirst();
                l++;
            }
            c+=(right-l+1);
        }
        return c;
    }
}