class Solution {
    private static int dp(int[] fib,int n){
        if(n==0||n==1)return n;
        if(fib[n]!=0)return fib[n];
        fib[n]=dp(fib,n-1)+dp(fib,n-2);
        return fib[n];
    }
    public int fib(int n) {
        int[] arr=new int[n+1];
        return dp(arr,n);
    }
}