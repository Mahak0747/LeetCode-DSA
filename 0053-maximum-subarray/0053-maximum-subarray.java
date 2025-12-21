class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int l=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int newsum=sum + nums[i];
            sum=Math.max(nums[i], newsum);
            l=Math.max(sum,l);
        }
        return l;
    }
}