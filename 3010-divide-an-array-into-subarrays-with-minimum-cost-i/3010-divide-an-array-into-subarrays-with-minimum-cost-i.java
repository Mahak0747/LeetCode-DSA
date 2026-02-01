class Solution {
    public int minimumCost(int[] nums) {
        int n = nums.length;
        int ans=nums[0];
        int minLeft = nums[1];
        int best = Integer.MAX_VALUE;
        for (int j = 2; j < n; j++) {
            best = Math.min(best, minLeft + nums[j]);
            minLeft = Math.min(minLeft, nums[j]);
        }
        return ans + best;
    }
}