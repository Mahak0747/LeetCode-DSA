class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long sum=0;
        for(int i=nums.length-1; i>=nums.length-k; i--){
            sum+=Math.max((long)nums[i]*mul,(long)nums[i]);
            mul--;
        }
        return sum;
    }
}