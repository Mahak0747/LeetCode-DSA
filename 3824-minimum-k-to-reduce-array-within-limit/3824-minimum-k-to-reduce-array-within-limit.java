class Solution {
    private boolean isValid(int k,int[] arr){
        long limit = 1L * k * k;
        long val=0;
        for(int x:arr){
            val+=(x+k-1)/k;
            if(val>limit)return false;
        }
        return true;
    }
    public int minimumK(int[] nums) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            max=Math.max(max,nums[i]);
        }
        int l=1;
        int u=Math.max(max, nums.length);
        int ans=max;
        while(l<=u){
            int mid=l+(u-l)/2;
            if(isValid(mid,nums)){
                ans=mid;
                u=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
}