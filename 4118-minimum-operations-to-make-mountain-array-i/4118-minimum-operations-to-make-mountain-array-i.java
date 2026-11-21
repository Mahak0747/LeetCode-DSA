class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        if(n<3)return -1;
        int max=0;
        for(int i:nums){
            max=Math.max(max,i);
        }
        int m=max+n;
        int[][] left = new int[n][m + 1];
        int[][] right = new int[n][m + 1];
        for(int i=1; i<=m; i++){
            left[0][i]=Math.abs(nums[0]-i);
        }
        for(int i=1; i<n; i++){
            int ans=1000000000;
            for(int j=1; j<=m; j++){
                if (j > 1) {
                    ans = Math.min(ans, left[i - 1][j - 1]);
                }
                left[i][j]=ans+Math.abs(nums[i]-j);
            }
        }
        for(int i=1; i<=m; i++){
            right[n-1][i]=Math.abs(nums[n-1]-i);
        }
        for(int i=n-2; i>=0; i--){
            int ans=1000000000;
            for(int j=1; j<=m; j++){
                if (j > 1) {
                    ans = Math.min(ans, right[i + 1][j - 1]);
                }
                right[i][j]=ans+Math.abs(nums[i]-j);
            }
        }
        int ans=1000000000;
        for(int i=1; i<n-1; i++){
            for(int j=1; j<=m; j++){
                int val=left[i][j]+right[i][j]-Math.abs(nums[i]-j);
                ans=Math.min(ans,val);
            }
        }
        return ans;
    }
}