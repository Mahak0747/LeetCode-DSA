class Solution {
    private static int rev(int n){
        int ans=0;
        while(n>0){
            ans*=10;
            ans+=n%10;
            n/=10;
        }
        return ans;
    }
    private static boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
    public int sumOfPrimesInRange(int n) {
        int r=rev(n);
        int l=Math.min(n,r);
        int u=Math.max(n,r);
        int ans=0;
        for(int i=l; i<=u; i++){
            if(isPrime(i))ans+=i;
        }
        return ans;
    }
}