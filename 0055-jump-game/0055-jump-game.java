class Solution {
    int[] dp;
    public boolean canJump(int[] nums) {
        dp = new int[nums.length];
        return solve(nums, 0);
    }
    public boolean solve(int[] nums, int i) {
        if (i == nums.length - 1) {
            return true;
        }
        if (dp[i] != 0) {
            return dp[i] == 1;
        }
        int maxJump = Math.min(i + nums[i], nums.length - 1);
        for (int j = i + 1; j <= maxJump; j++) {
            if (solve(nums, j)) {
                dp[i] = 1;
                return true;
            }
        }
        dp[i] = -1;
        return false;
    }
}