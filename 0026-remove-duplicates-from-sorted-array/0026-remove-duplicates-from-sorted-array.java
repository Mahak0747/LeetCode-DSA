class Solution {
    public int removeDuplicates(int[] nums) {
        int t=1;
        int val=nums[0];
        for(int i=1; i<nums.length; i++){            
            if(nums[i]!=val){
                val=nums[i];
                nums[t]=nums[i];
                t++;
            }
        }
        return t;
    }
}