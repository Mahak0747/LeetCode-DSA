class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long c=0;
        long ans=0;
        for(int i:nums){
            if(i<minK||i>maxK){
                c=0;
                continue;
            }
            c++;
            ans+=c;
        }
        return ans;
    }
}