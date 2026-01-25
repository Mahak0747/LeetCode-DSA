class Solution {
    private boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3; i*i<=n; i+=2){
            if(n%i==0)return false;
        }
        return true;
    }
    public int largestPrime(int n) {
        int sum=0;
        int i=2;
        int ans=0;
        while(sum<=n){
            if(isPrime(i)){
                sum+=i;
                if(sum<=n && isPrime(sum)){
                    ans=sum;
                }
            }
            i++;
        }
        return ans;
    }
}