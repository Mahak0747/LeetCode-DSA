class Solution {
    public boolean checkDivisibility(int n) {
        int s=0;
        int p=1;
        int t=n;
        while(t>0){
            int rem=t%10;
            s+=rem;
            p*=rem;
            t/=10;
        }
        return n%(s+p)==0;
    }
}