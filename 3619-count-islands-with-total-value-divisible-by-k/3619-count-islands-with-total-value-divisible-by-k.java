class Solution {
    private static long dfs(int[][] grid, int r, int c) {
        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] <= 0) {
            return 0;
        }
        long val = grid[r][c];
        grid[r][c] = 0; 
        val += dfs(grid, r + 1, c);
        val += dfs(grid, r - 1, c);
        val += dfs(grid, r, c + 1);
        val += dfs(grid, r, c - 1);
        return val;
    }
    public int countIslands(int[][] grid, int k) {
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > 0) {
                    long val = dfs(grid, r, c);
                    if (val % k == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}