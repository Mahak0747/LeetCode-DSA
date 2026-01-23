class Solution {
    private static int tfib(int[] fib, int n){
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        if(fib[n]!=0)return fib[n];
        fib[n]=tfib(fib,n-1)+tfib(fib,n-2)+tfib(fib,n-3);
        return fib[n];
    }
    public int tribonacci(int n) {
        int[] fib=new int[n+1];
        return tfib(fib,n);
    }
}