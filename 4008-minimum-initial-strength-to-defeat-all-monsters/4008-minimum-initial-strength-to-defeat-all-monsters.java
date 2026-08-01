class Solution {
    public long minInitialStrength(int[] monsters, int[][] boosts) {
        int n=monsters.length;
        long[] arr=new long[n+1];
        for(int[] i:boosts){
            int l=i[0];
            int r=i[1];
            long v=i[2];
            arr[l]+=v;
            if(r+1<n)arr[r+1]-=v;
        }
        long ans=0;
        long pre=0;
        long b=0;
        for(int i=0; i<n; i++){
            b+=arr[i];
            long m=monsters[i];
            if(m>b){
                long need=pre+m-b;
                ans=Math.max(ans,need);
            }
            pre+=m;
        }
        return ans;
    }
}