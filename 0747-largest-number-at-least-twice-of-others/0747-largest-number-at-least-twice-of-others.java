class Solution {
    public int dominantIndex(int[] nums) {
        int max=0;
        for(int i:nums)max=Math.max(max,i);
        int idx=-1;
        boolean is=true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==max){
                idx=i;
                continue;
            }
            if(2*nums[i]>max){
                is=false;
                break;
            }
        }
        return is?idx:-1;
    }
}