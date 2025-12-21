class Solution {
    public static long tHours(int[] arr,int n){
        long TH=0;
        for(int i=0; i<arr.length;i++){
            TH += (arr[i] + n - 1) / n;
        }
        return TH;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int u=Integer.MIN_VALUE;
        int l=1;
        for(int i=0; i<piles.length; i++){
            u=Math.max(piles[i],u);
        }
        int ans=0;
        while(l<=u){
            int mid=l+(u-l)/2;
            long tHours=tHours(piles,mid);
            if(tHours<=h){
                ans=mid;
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return ans;
    }
}