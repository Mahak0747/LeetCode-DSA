class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        int[][] dp=new int[grid.length+1][grid[0].length+1];
        int c=0;
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                dp[i+1][j+1]=grid[i][j]+dp[i][j+1]+dp[i+1][j]-dp[i][j];
                if(dp[i+1][j+1]<=k)c++;
            }
        }
        return c;
    }
}