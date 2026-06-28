class Solution {
    private static int sw(int[] nums, int goal){
        if(goal<0)return 0;
        int l=0;
        int r=0;
        int x=0;
        int sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum>goal){
                sum-=nums[l];
                l++;
            }
            x+=r-l+1;
            r++;
        }
        return x;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return sw(nums,goal)-sw(nums,goal-1);
    }
}