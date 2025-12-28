class Solution {
    public long maximumScore(int[] nums) {
        int n = nums.length;
        int[] ss=new int[n];
        ss[n-1]=nums[n-1];
        for(int i=n-2; i>=0; i--){
            ss[i]=Math.min(nums[i],ss[i+1]);
        }
        long ps=0;
        long max=Integer.MIN_VALUE;
        for(int i=0; i<n-1; i++){
            ps+=nums[i];
            max=Math.max(max,ps-ss[i+1]);
        }
        return max;
    }
}