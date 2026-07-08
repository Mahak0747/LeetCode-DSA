class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int mod=1000000007;
        int n=s.length();
        int ans[]=new int[queries.length];
        int prefsum[]=new int[n+1];
        prefsum[0]=0;

        long prefnum[]=new long[n+1];
        prefnum[0]=0;

        int prefcnt[]=new int[n+1];
        prefcnt[0]=0;
        for(int i=1;i<n+1;i++){
            prefsum[i]=(s.charAt(i-1)-'0') +prefsum[i-1];
            if(s.charAt(i-1)!='0')prefnum[i]=(((1L*prefnum[i-1]*10)%mod)+(s.charAt(i-1)-'0'))%mod;
            else prefnum[i]=prefnum[i-1];
            prefcnt[i]=s.charAt(i-1)=='0'? 0+prefcnt[i-1]:1+prefcnt[i-1];
        }

        int idx=0;
        for(int q[]:queries){
            int numOfDig=prefcnt[q[1]+1]-prefcnt[q[0]];
            int sum=prefsum[q[1]+1]-prefsum[q[0]];
            int factor=pow(numOfDig,mod);
            long num=(prefnum[q[1]+1]-(1L*prefnum[q[0]]*factor)%mod+mod)%mod;
            long val=(num*sum)%mod;
            ans[idx++]=(int) val;
        }
        return ans;
    }
    public static int pow(int exp,int mod){
        long ans=1;
        long num=10;
        while(exp>0){
            if((exp & 1)!=0) ans=(ans*num)%mod;
            num=(num*num)%mod;
            exp=exp>>1;
        }
        return (int)(ans%mod);

    }
}