class Solution {
    public int maxValidPairSum(int[] nums, int k) {
        int max=nums[0];
        int ans=Integer.MIN_VALUE;
        for(int i=k; i<nums.length; i++){
            max=Math.max(max,nums[i-k]);
            ans=Math.max(ans,max+nums[i]);
        }
        return ans;
    }
}