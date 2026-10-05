class Solution {
    public void wiggleSort(int[] nums) {
        int n = nums.length;
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int idx = 0;
        for (int i = (n - 1) / 2; i >= 0; i--) {
            nums[idx] = arr[i];
            idx += 2;
        }
        idx = 1;
        for (int i = n - 1; i > (n - 1) / 2; i--) {
            nums[idx] = arr[i];
            idx += 2;
        }
    }
}