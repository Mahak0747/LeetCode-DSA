class Solution {
    public int maximumDifference(int[] nums) {
        int p=0;
        int buy=nums[0];
        for(int i=0; i<nums.length; i++){
            if(buy>nums[i]){
                buy=nums[i];
            }
            else{
                p=Math.max(p,(nums[i]-buy));
            }
        }
        return p==0?-1:p;
    }
}