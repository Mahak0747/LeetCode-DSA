class Solution {
    private boolean enough(int[] arr, int day, int m, int k){
        int n=arr.length;
        int bouquets=0;
        int count=0;
        for(int i=0; i<n; i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                bouquets+=count/k;
                count=0;
            }
        }
        bouquets+=count/k;
        return (bouquets>=m);
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if ((long) m * k > n) return -1;
        int l=bloomDay[0];
        int u=bloomDay[0];
        for(int i=1; i<n; i++){
            u=Math.max(u,bloomDay[i]);
            l=Math.min(l,bloomDay[i]);
        }
        while(l<=u){
            int mid=l+(u-l)/2;
            if(enough(bloomDay,mid,m,k)){
                u=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }
}