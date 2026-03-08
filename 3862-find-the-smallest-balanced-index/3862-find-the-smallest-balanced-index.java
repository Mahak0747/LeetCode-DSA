class Solution {
    public int smallestBalancedIndex(int[] nums) {
        int n = nums.length;

        long[] dp = new long[n + 1];
        dp[n] = 1;

        long LIMIT = (long)1e15;

        for (int i = n - 1; i >= 0; i--) {
            if (dp[i + 1] > LIMIT / nums[i]) {
                dp[i] = LIMIT;
            } else {
                dp[i] = dp[i + 1] * nums[i];
            }
        }

        long sum = 0;

        for (int i = 0; i < n; i++) {
            if (sum == dp[i + 1]) return i;
            sum += nums[i];
        }

        return -1;
    }
}