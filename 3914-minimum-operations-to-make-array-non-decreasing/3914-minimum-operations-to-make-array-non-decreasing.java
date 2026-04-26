class Solution {
    public long minOperations(int[] nums) {
        int n = nums.length;
        long ans = 0;
        long prev = 0; 
        for (int i = 1; i < n; i++) {
            long cur = Math.max(0, prev + nums[i - 1] - nums[i]);
            if (cur > prev) {
                ans += (cur - prev);
            }
            prev = cur;
        }
        return ans;
    }
}