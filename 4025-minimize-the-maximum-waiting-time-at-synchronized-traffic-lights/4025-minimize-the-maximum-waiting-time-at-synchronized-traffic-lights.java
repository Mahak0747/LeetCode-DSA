class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int q=0;
        for(int k:lights){
            q=Math.max(q,k);
        }
        int ans=0;
        for(int at:arrivalTime){
            int r=at%period;
            int s;
            if(r<q)s=0;
            else s=period-r;
            ans=Math.max(ans,s);
        }
        return ans;
    }
}