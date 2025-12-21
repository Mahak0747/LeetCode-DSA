class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0;
        if(nums[0]<0&&nums[1]<0){
            max=Math.max((nums[0]-1)*(nums[1]-1),(nums[n-1]-1)*(nums[n-2]-1));
            return max;
        }
        max=(nums[n-1]-1)*(nums[n-2]-1);
        return max;
    }
}