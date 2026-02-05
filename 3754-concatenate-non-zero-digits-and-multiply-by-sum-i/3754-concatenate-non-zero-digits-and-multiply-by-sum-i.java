class Solution {
    public long sumAndMultiply(int n) {
        n=Integer.parseInt(new StringBuilder(n+"").reverse().toString());
        long sum=0;
        long ans=0;
        while(n>0){
            int rem=n%10;
            if(rem!=0){
                sum+=rem;
                ans*=10;
                ans+=rem;
            }
            n/=10;
        }
        return sum*ans;
    }
}