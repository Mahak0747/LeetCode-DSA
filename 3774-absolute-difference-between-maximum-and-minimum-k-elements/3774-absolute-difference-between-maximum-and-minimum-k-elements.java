class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0;i<k; i++){
            ans+=nums[i];
            ans-=nums[n-k+i];
        }
        return Math.abs(ans);
    }
}