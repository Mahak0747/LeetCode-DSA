class Pair{
    int i;
    int j;
    public Pair(int i, int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int numEnclaves(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] ans=new int[n][m];
        Queue<Pair> q=new LinkedList<Pair>();
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1 && (i==0||j==0||i==n-1||j==m-1)){
                    q.add(new Pair(i,j));
                    ans[i][j]=1;
                }
            }
        }
        int[] x={-1,0,1,0};
        int[] y={0,1,0,-1};
        while(!q.isEmpty()){
            Pair curr=q.remove();
            int r=curr.i;
            int c=curr.j;
            for(int i=0; i<4; i++){
                int nr=r+x[i];
                int nc=c+y[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && grid[nr][nc]==1 && ans[nr][nc]==0){
                    q.add(new Pair(nr,nc));
                    ans[nr][nc]=1;
                }
            }
        }
        int c=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==1&&ans[i][j]==0)c++;
            }
        }
        return c;
    }
}