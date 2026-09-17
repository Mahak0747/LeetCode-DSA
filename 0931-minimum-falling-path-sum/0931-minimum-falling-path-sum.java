class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int[] dp=new int[n];
        for(int i=0; i<n; i++){
            dp[i]=matrix[0][i];
        }
        for (int i = 1; i < n; i++) {
            int[] temp = new int[n];
            for(int j=0; j<n; j++){
                int u=dp[j];
                int ld=Integer.MAX_VALUE;
                if(j-1>=0)ld=dp[j-1];
                int rd=Integer.MAX_VALUE;
                if(j+1<n)rd=dp[j+1];
                temp[j]=matrix[i][j]+Math.min(u,Math.min(ld,rd));
            }
            dp=temp;
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, dp[j]);
        }
        return ans;
    }
}