class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        Deque<Integer> s = new ArrayDeque<>();
        for(int i=2*n-1; i>=0; i--){
            int curr=nums[i%n];
            while(!s.isEmpty() && s.peek()<=curr)s.pop();
            if(i<n)res[i]=s.isEmpty()?-1:s.peek();
            s.push(curr);
        }
        return res;
    }
}