class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[n*2];
        int idx=0;
        for(int i=0; i<n; i++){
            ans[idx]=nums[i];
            ans[idx+1]=nums[i+n];
            idx+=2;
        }
        return ans;
    }
}