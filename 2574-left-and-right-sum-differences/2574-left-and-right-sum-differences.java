class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] res=new int[nums.length];
        int val=0;
        for(int i=0; i<nums.length; i++){
            res[i]=val;
            val+=nums[i];
        }
        val=0;
        for(int i=nums.length-1; i>=0; i--){
            res[i]=Math.abs(res[i]-val);
            val+=nums[i];
        }
        return res;
    }
}