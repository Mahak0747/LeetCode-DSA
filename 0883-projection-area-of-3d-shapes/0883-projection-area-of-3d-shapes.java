class Solution {
    public int projectionArea(int[][] grid) {
        int n = grid.length;
        int top = 0;
        int xz = 0;
        int yz = 0;
        for(int i = 0; i < n; i++) {
            int rowMax = 0;
            int colMax = 0;
            for(int j = 0; j < n; j++) {
                if(grid[i][j] > 0) {
                    top++;
                }
                rowMax = Math.max(rowMax, grid[i][j]);
                colMax = Math.max(colMax, grid[j][i]);
            }
            xz += rowMax;
            yz += colMax;
        }
        return top + xz + yz;
    }
}