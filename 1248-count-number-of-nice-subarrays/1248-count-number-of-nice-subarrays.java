class Solution {
    private static int sw(int[] nums, int goal){
        if(goal<0)return 0;
        int l=0;
        int r=0;
        int x=0;
        int sum=0;
        while(r<nums.length){
            if(nums[r]%2!=0)sum++;
            while(sum>goal){
                if(nums[l]%2!=0)sum--;
                l++;
            }
            x+=r-l+1;
            r++;
        }
        return x;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return sw(nums,k)-sw(nums,k-1);
    }
}