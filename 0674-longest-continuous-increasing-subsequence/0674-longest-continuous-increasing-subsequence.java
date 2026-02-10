class Solution {
    public int findLengthOfLCIS(int[] arr) {
        int max=1;
        int l=1;
        for(int i=1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                l++;
            }
            else{
                max=Math.max(max,l);
                l=1;
            }
        }
        max=Math.max(max,l);
        return max;
    }
}