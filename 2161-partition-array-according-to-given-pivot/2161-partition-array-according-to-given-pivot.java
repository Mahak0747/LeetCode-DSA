class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] ans = new int[n];
        int idx = 0;
        for (int x : nums)
            if (x < pivot)
                ans[idx++] = x;
        for (int x : nums)
            if (x == pivot)
                ans[idx++] = x;
        for (int x : nums)
            if (x > pivot)
                ans[idx++] = x;
        return ans;
    }
}