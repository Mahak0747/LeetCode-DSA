class Solution {
    public int[] lastVisitedCell(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[] row = {0, 0, -1, 1};
        int[] col = {-1, 1, 0, 0};
        boolean[][] seen = new boolean[m][n];
        seen[0][0] = true;
        String move = "LRUD";
        int r=0;
        int c=0;
        while(true){
            char ch = grid[r][c];
            int idx = move.indexOf(ch);
            int nr = r + row[idx];
            int nc = c + col[idx];
            if(nr<0 || nc<0 || nr>=m || nc>=n || seen[nr][nc])break;
            r=nr;
            c=nc;
            seen[nr][nc]=true;
        }
        return new int[]{r,c};
    }
}