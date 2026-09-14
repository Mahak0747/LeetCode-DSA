class Solution {
    private static int min(int[][] mat, int r, int c, int[][] dp) {
        if (r == 0 && c == 0)return mat[0][0];
        if (r < 0 || c < 0) return Integer.MAX_VALUE;
        if (dp[r][c] != -1) return dp[r][c];
        int up = min(mat, r - 1, c, dp);
        int left = min(mat, r, c - 1, dp);
        return dp[r][c] = mat[r][c] + Math.min(up, left);
    }
    public int minPathSum(int[][] grid) {
        int height = grid.length;
        int width = grid[0].length;
        int[][] dp = new int[height][width];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        return min(grid, height - 1, width - 1, dp);
    }
}
