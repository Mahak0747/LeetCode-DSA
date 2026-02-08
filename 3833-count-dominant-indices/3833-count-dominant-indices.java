class Solution {
    public int dominantIndices(int[] nums) {
        int n=nums.length;
        int sum=nums[n-1];
        int total=1;
        int c=0;
        for(int i=n-2; i>=0; i--){
            if(nums[i]>sum/total)c++;
            sum+=nums[i];
            total++;
        }
        return c;
    }
}