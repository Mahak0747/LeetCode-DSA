class Solution {
    public int findKthPositive(int[] arr, int k) {
        int l=0;
        int u=arr.length-1;
        while(l<=u){
            int mid=l+(u-l)/2;
            int missing=arr[mid]-(mid+1);
            if(missing<k)l=mid+1;
            else u=mid-1;
        }
        return l+k;
    }
}