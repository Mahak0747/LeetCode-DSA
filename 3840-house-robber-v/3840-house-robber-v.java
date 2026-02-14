class Solution {
    public long rob(int[] nums, int[] colors) {
        int n=nums.length;
        if(n==1)return nums[0];
        long[] dp=new long[n];
        dp[0]=nums[0];
        for(int i=1; i<n; i++){
            long back=dp[i-1];
            long add;
            if(colors[i]!=colors[i-1]){
                add=nums[i]+dp[i-1];
            }
            else{
                add=nums[i]+(i>=2?dp[i-2]:0);
            }
            dp[i]=Math.max(add,back);
        }
        return dp[n-1];
    }
}