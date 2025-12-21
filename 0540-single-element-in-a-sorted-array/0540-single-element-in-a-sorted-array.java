class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1)return nums[0];
        if(nums[0]!=nums[1])return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2])return nums[nums.length-1];
        int l=1;
        int u=nums.length-2;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]){
                return nums[mid];
            }
            if((mid%2==0 && nums[mid+1]==nums[mid])||(mid%2!=0 && nums[mid]==nums[mid-1])){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        return -1;
    }
}