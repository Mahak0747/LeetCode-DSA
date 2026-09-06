class Solution {
    public int countGoodRotations(int[] nums) {
        int n=nums.length;
        int m=n/2;
        long total=0;
        for(int i:nums)total+=i;
        long first=0;
        for(int i=0; i<m; i++)first+=nums[i];
        int ans=0;
        for(int i=0; i<n; i++){
            if(2*first>total)ans++;
            first-=nums[i];
            first+=nums[(i+m)%n];
        }
        return ans;
    }
}