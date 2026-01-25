class Solution {
    public int minimumPrefixLength(int[] nums) {
        int n=nums.length;
        if(n<=1)return 0;
        int c=0;
        for(int i=n-1; i>0; i--){
            if(nums[i-1]>=nums[i]){
                c=i;
                break;
            }
        }
        return c;
    }
}