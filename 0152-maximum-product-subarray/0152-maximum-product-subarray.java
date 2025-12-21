class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int ans=Integer.MIN_VALUE;
        int p=1,s=1;
        for(int i=0; i<n; i++){
            if(p==0)p=1;
            if(s==0)s=1;
            p*=nums[i];
            s*=nums[n-i-1];
            int a=Math.max(p,s);
            ans=Math.max(ans,a);
        }
        return ans;
    }
}