class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int u=nums.length-1;
        while(l<u) {
            int mid = l + (u-l)/2;
            if(nums[mid] < nums[u]) u = mid;
            else if(nums[mid] > nums[u]) l = mid+1;
            else u--;
        }
        return nums[l];
    }
}