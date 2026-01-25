class Solution {
    private static int upperBound(int[] arr, int x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }
    public int countElements(int[] nums, int k) {
        int n=nums.length;
        if(k>=n)return 0;
        Arrays.sort(nums);
        int ans=0;
        for (int x : nums) {
            int idx = upperBound(nums, x);
            int countGreater = n - idx;
            if (countGreater >= k) ans++;
        }
        return ans;
    }
}