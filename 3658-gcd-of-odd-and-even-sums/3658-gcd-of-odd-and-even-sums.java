class Solution {
    private static int gcd(int a,int b){
        if (b == 0) {
            return Math.abs(a);
        }
        return gcd(b, a % b);
    }
    public int gcdOfOddEvenSums(int n) {
        int os=0;
        int es=0;
        for(int i=0; i<=2*n; i++){
            if(i%2==0)es+=i;
            else os+=i;
        }
        return gcd(os,es);
    }
}