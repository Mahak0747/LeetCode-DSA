class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int[] ans = new int[nums.length];
        int idx = 0;
        while (idx < nums.length) {
            for (int val = 1; val <= 100; val++) {
                if (freq[val] > 0) {
                    ans[idx++] = val;
                    freq[val]--;
                }
            }
        }
        return ans;
    }
}