class Solution {
    public int minimumSwaps(int[] nums) {
        int cnt=0;
        for(int i:nums)if(i==0)cnt++;
        int val=0;
        for(int i=nums.length-1; i>nums.length-1-cnt; i--)if(nums[i]==0)val++;
        return cnt-val;
    }
}