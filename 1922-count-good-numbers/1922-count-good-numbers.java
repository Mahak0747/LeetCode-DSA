class Solution {
    static final long MOD=1000000007;
    public static long optimizedPower(long x,long n){
        if(n==0){
            return 1;
        }
        long halfPow=optimizedPower(x,n/2)% MOD;
        long halfPowSq=(halfPow*halfPow)% MOD;
        if(n%2!=0){
            halfPowSq=(halfPowSq*x)% MOD;
        }
        return halfPowSq;
    }
    public int countGoodNumbers(long n) {
        long e = (n + 1) / 2;
        long o = n / 2;
        long ep = optimizedPower(5, e);
        long op = optimizedPower(4, o);
        return (int)((ep * op) % MOD);
    }
}