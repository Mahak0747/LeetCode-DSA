class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int u=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(nums[l]<=nums[u]){
                min=Math.min(min,nums[l]);
                break;
            }
            if(nums[l]<=nums[mid]){
                min=Math.min(min,nums[l]);
                l=mid+1;
            }
            else{
                min=Math.min(min,nums[mid]);
                u=mid-1;
            }
        }
        return min;
    }
}