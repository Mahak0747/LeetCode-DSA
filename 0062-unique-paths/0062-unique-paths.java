class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                int r=0;
                int d=0;
                if(i>0)r=dp[i-1][j];
                if(j>0)d=dp[i][j-1];
                if (i != 0 || j != 0)dp[i][j]=r+d;
            }
        }
        return dp[m-1][n-1];
    }
}