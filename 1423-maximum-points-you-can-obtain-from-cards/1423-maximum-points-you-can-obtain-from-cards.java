class Solution {
    public int maxScore(int[] arr, int k) {
        int lsum=0;
        int rsum=0;
        int max=0;
        for(int i=0; i<k; i++)lsum+=arr[i];
        max=lsum;
        int r=arr.length-1;
        for(int i=k-1; i>=0; i--){
            lsum-=arr[i];
            rsum+=arr[r];
            r--;
            max=Math.max(max,lsum+rsum);
        }
        return max;
    }
}