class Solution {
    private static boolean isPrime(int n){
        if(n<2)return false;
        if(n==2)return true;
        if(n%2==0)return false;
        for(int i=3; i*i<=n; i++){
            if(n%i==0)return false;
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int l=left;
        int r=right;
        int ans=0;
        while(l<=r){
            int curr=l;
            int count=0;
            while(curr>0){
                int val=curr&1;
                if(val==1)count++;
                curr >>= 1;
            }
            if(isPrime(count))ans++;
            l++;
        }
        return ans;
    }
}