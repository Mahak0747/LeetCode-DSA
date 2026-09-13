class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] mat=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int nc=(j-rowShift[i]+n)%n;
                mat[i][nc]=grid[i][j];
            }
        }
        int[][] ans=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                int nr=(j-colShift[i]+n)%n;
                ans[nr][i]=mat[j][i];
            }
        }
        return ans;
    }
}