class Solution {
    private boolean isPossible(int[]nums, int threshold, int divisor) {
        int sum = 0;
        for(int n:nums) {
            sum += (n+divisor-1)/divisor;
            if(sum>threshold) return false;
        }
        return true;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int u=Integer.MIN_VALUE;
        int l=1;
        for(int i=0; i<nums.length; i++){
            u=Math.max(nums[i],u);
        }
        int ans=0;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(isPossible(nums,threshold,mid)){
                ans=mid;
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}