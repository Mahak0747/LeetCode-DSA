class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=i;j<nums.length;j++){
                if(nums[j]==target) c++;
                if(c>(j-i+1)/2) ans++;
            }
        }return ans;
    }
}