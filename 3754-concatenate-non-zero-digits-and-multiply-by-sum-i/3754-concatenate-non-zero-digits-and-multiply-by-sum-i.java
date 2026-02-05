class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long ansO=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                ansO*=10;
                ansO+=rem;
            }
            n/=10;
        }
        long val=ansO;
        long ans=0;
        while(val>0){
            long rem=val%10;
            ans*=10;
            ans+=rem;
            val/=10;
        }
        return sum*ans;
    }
}