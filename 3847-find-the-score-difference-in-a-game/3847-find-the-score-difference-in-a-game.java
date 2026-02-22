class Solution {
    public int scoreDifference(int[] nums) {
        int f=0;
        int s=0;
        boolean first=true;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==1)first= !first;
            if(i%6==5)first= !first;
            if(first)f+=nums[i];
            else s+=nums[i];
        }
        return f-s;
    }
}