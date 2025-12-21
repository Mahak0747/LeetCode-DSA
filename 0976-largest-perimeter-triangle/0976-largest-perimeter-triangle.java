class Solution {
    public int largestPerimeter(int[] nums) {
        if(nums.length < 3){
            return 0;
        }
        Arrays.sort(nums);
        for (int i = nums.length - 1; i >= 2; i--) {
            if(nums[i-2] + nums[i-1] > nums[i]){
                return nums[i-2] + nums[i-1] + nums[i];
            }
        }
        return 0;
    }
}