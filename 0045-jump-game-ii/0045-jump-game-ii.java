class Solution {
    private static int minJumps(int[] nums,int i,int[] dp){
        if(i==0)return 0;
        if(dp[i]!=-1)return dp[i];
        int ans= 10000;
        for(int j=0; j<i; j++){
            if (j + nums[j] >= i) {
                ans = Math.min(ans, 1 + minJumps(nums, j,dp));
            }
        }
        return dp[i]=ans;
    }
    public int jump(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        dp[0]=0;
        minJumps(nums,n-1,dp);
        return dp[n-1];
    }
}