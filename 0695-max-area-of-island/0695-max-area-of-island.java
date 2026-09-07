class Solution {
    private static int dfs(int[][] grid, int r, int c, boolean[][] seen){
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        seen[r][c]=true;
        int area = 1;
        for(int i=0; i<4; i++){
            int nr=r+row[i];
            int nc=c+col[i];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]==1 && !seen[nr][nc]){
                area += dfs(grid, nr, nc, seen);
            }
        }
        return area;
    }
    public int maxAreaOfIsland(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        boolean[][] seen=new boolean[n][m];
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1 && !seen[i][j]){
                    int area = dfs(grid, i, j, seen);
                    max = Math.max(max, area);
                }
            }
        }
        return max;
    }
}