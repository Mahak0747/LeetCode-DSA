class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int ans[]= new int[nums.length];
        int fi = 0;
        int li = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[fi] = nums[i];
                fi=fi+2;
            }else{
                ans[li] = nums[i];
                li=li+2;
            }
        }
        return ans;
    }
}