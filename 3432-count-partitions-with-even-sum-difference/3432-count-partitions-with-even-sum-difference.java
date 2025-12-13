class Solution {
    public int countPartitions(int[] nums) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int left = 0;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            left += nums[i];
            int right = total - left;
            if ((left-right) % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }
}