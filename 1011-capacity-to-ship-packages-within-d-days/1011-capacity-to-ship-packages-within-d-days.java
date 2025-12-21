class Solution {
    private static int isPossible(int[] arr, int capacity) {
        int dayCount = 1; 
        int load = 0;
        for (int w : arr) {
            if (load + w <= capacity) {
                load += w;
            } else {
                dayCount++;
                load = w;
            }
        }
        return dayCount; 
    }
    public int shipWithinDays(int[] weights, int days) {
        int u=0;
        int l=weights[0];
        for (int w : weights) {
            u+=w;
            l=Math.max(w,l);
        }
        int ans=0;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(isPossible(weights, mid)<=days){
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