class Pair{
    int f;
    int s;
    public Pair(int a,int b){
        this.f=a;
        this.s=b;
    }
}
class Solution {
    private static void bfs(char[][] grid,boolean[][] seen,int i,int j){
        seen[i][j]=true;
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(i,j));
        int m=grid.length;
        int n=grid[0].length;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        while(!q.isEmpty()){
            Pair cur = q.remove();
            for (int k = 0; k < 4; k++) {
                int rr = cur.f + row[k];
                int cc = cur.s + col[k];
                if(rr>=0 && rr<m && cc>=0 && cc<n && grid[rr][cc]=='1' && !seen[rr][cc]){
                    seen[rr][cc]=true;
                    q.add(new Pair(rr,cc));
                }
            }
        }
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] seen=new boolean[m][n];
        int c=0;
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(grid[i][j]=='1'&& !seen[i][j]){
                    bfs(grid,seen,i,j);
                    c++;
                }
            }
        }
        return c;
    }
}