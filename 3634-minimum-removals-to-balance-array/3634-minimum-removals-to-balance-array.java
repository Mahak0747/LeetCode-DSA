class Solution {
    public int minRemoval(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return 0;
        Arrays.sort(nums);
        int maxLen = 1;
        int l = 0;
        for (int r = 0; r < n; r++) {
            while (nums[r] > (long) k * nums[l]) {
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return n - maxLen;
    }
}
