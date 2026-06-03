class Pair{
    int i;
    int j;
    public Pair(int i,int j){
        this.i=i;
        this.j=j;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<Pair>();
        int[][] ans=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==0){
                    ans[i][j]=0;
                    q.add(new Pair(i,j));
                }
                else ans[i][j]=-1;
            }
        }
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        while(!q.isEmpty()){
            int r=q.peek().i;
            int c=q.peek().j;
            q.remove();
            for(int i=0; i<4; i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && ans[nr][nc]==-1){
                    q.add(new Pair(nr,nc));
                    ans[nr][nc]=ans[r][c]+1;
                }
            }
        }
        return ans;
    }
}