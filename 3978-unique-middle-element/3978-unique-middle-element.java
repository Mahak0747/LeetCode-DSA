class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int mid=nums[nums.length/2];
        int count=0;
        for(int i:nums){
            if(i==mid)count++;
        }
        return count==1;
    }
}