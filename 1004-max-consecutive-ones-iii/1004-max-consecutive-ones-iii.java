class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=Integer.MIN_VALUE;
        int l=0;
        int r=0;
        int zero=0;
        while(r<nums.length){
            if(nums[r]==0)zero++;
            while(zero>k){
                if(nums[l]==0)zero--;
                l++;
            }
            if(zero<=k){
                max=Math.max(max,r-l+1);
            }
            r++;
        }
        return max;
    }
}