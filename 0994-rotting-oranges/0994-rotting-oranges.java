class Pair{
    int row;
    int col;
    int tim;
    public Pair(int r,int c,int t){
        this.row=r;
        this.col=c;
        this.tim=t;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        Queue<Pair> q=new LinkedList<Pair>();
        boolean[][] seen=new boolean[n][m];
        int fresh=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(grid[i][j]==2){
                    q.add(new Pair(i,j,0));
                    seen[i][j]=true;
                }
                if(grid[i][j]==1)fresh++;
            }
        }
        int tt=0;
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        int val=0;
        while(!q.isEmpty()){
            int r=q.peek().row;
            int c=q.peek().col;
            int t=q.peek().tim;
            tt=Math.max(tt,t);
            q.remove();
            for(int i=0; i<4; i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m && !seen[nr][nc] && grid[nr][nc]==1){
                    q.add(new Pair(nr,nc,t+1));
                    seen[nr][nc]=true;
                    val++;
                }
            }
        }
        if(val!=fresh)return -1;
        else return tt;
    }
}