class Solution {
    static int[] fact={1,1,2,6,24,120,720,5040,40320,362880};
    private static boolean check(long a,long b){
        int[] count = new int[10];
        while (a > 0) {
            count[(int)(a % 10)]++;
            a /= 10;
        }
        while (b > 0) {
            count[(int)(b % 10)]--;
            b /= 10;
        }
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
    public boolean isDigitorialPermutation(int n) {
        int temp=n;
        long sum=0;
        while(temp>0){
            int rem=temp%10;
            sum+=fact[rem];
            temp/=10;
        }
        if (sum < 0) return false;
        return check(n,sum);
    }
}