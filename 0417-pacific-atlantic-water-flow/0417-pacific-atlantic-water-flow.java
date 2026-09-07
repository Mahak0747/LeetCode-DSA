class Solution {
    List<List<Integer>> ans;
    private static void dfs(int r,int c,int[][] graph, boolean[][] seen){
        if(seen[r][c])return;
        seen[r][c]=true;
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        for(int i=0; i<4; i++){
            int nr=r+row[i];
            int nc=c+col[i];
            if(nr>=0 && nc>=0 && nr<graph.length && nc<graph[0].length && graph[nr][nc] >= graph[r][c]){
                dfs(nr,nc,graph,seen);
            }
        }
    }
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        boolean[][] pacific = new boolean[m][n];
        boolean[][] atlantic = new boolean[m][n];
        for (int j = 0; j < n; j++) dfs(0, j, heights, pacific);
        for (int i = 0; i < m; i++) dfs(i, 0, heights, pacific);
        for (int j = 0; j < n; j++) dfs(m - 1, j, heights, atlantic);
        for (int i = 0; i < m; i++) dfs(i, n - 1, heights, atlantic);
        ans=new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    ans.add(Arrays.asList(i, j));
                }
            }
        }
        return ans;
    }
}