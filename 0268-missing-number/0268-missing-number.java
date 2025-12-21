class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum=0;
        // int[] hashArr=new int[n+1];
        // for(int i=0; i<=n; i++){
            
        // }
        for(int i=0; i<n; i++){
            sum^=i+1;
            sum^=nums[i];
        }
        return sum;
    }
}