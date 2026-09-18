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
        dp[n-1]=0;
        for(int i=n-2; i>=0; i--){
            int ans= 100000;
            for(int j=1; j<=nums[i] && i+j<n; j++){
                ans = Math.min(ans, 1 + dp[j+i]);
            }
            dp[i]=ans;
        }
        return dp[0];
    }
}