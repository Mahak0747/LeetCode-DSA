class Solution {
    private static int dp(int[] steps,int n){
        if(n==0)return 1;
        if(n<0)return 0;
        if(steps[n]!=0)return steps[n];
        steps[n]=dp(steps,n-1)+dp(steps,n-2);
        return steps[n];
    }
    public int climbStairs(int n) {
        int[] arr=new int[n+1];
        return dp(arr,n);
    }
}