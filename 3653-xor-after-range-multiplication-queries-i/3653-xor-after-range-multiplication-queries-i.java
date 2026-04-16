class Solution {
    static int mod=1000000007;
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int q[]:queries){
            int l=q[0];
            int r=q[1];
            int k=q[2];
            int v=q[3];
            for(int i=l;i<=r;i+=k){
                nums[i]=(int)(((long)nums[i]*v)%mod);
            }
        }
        int xor=0;
        for(int i:nums) xor^=i;
        return xor;
    }
}