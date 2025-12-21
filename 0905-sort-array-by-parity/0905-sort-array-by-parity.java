class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int ans[]= new int[nums.length];
        int fi = 0;
        int li = nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                ans[fi] = nums[i];
                fi++;
            }else{
                ans[li] = nums[i];
                li--;
            }
        }
        return ans;
    }
}