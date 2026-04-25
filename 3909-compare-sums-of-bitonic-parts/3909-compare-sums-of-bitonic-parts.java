class Solution {
    public int compareBitonicSums(int[] nums) {
        int n = nums.length;
        int peak = 0;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[peak]) peak = i;
        }
        long a = 0; 
        long d = 0; 
        for (int i = 0; i < peak; i++) {
            a += nums[i];
        }
        for (int i = peak + 1; i < n; i++) {
            d += nums[i];
        }
        if (a == d) return -1;
        if (d > a) return 1;
        return 0;
    }
}