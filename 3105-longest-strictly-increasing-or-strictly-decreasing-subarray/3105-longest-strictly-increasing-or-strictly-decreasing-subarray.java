class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int r=1;
        int len=1;
        while(r<nums.length){
            if(nums[r]>nums[r-1]){
                len++;
                max=Math.max(max,len);
            }
            else{
                len=1;
            }
            r++;
        }
        r=1;
        len=1;
        while(r<nums.length){
            if(nums[r]<nums[r-1]){
                len++;
                max=Math.max(max,len);
            }
            else{
                len=1;
            }
            r++;
        }
        return max;
    }
}