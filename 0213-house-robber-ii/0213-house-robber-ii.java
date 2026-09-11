class Solution {
    private static int rob1(int[] nums,int s,int e){
        int prev=0;
        int prev2=0;
        for(int i=s; i<=e; i++){
            int pic=nums[i]+prev2;
            int notpic=prev;
            int curr=Math.max(pic,notpic);
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n == 1) return nums[0];
        int val=rob1(nums,0,n-2);
        int val2=rob1(nums,1,n-1);
        return Math.max(val,val2);
    }
}