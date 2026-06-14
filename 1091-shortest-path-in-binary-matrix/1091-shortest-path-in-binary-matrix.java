class Cell{
    int d;
    int r;
    int c;
    public Cell(int d, int r, int c){
        this.d=d;
        this.r=r;
        this.c=c;
    }
}
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n=grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1)return -1;
        int[][] distance=new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++)
                distance[i][j]=Integer.MAX_VALUE;
        }
        distance[0][0]=1;
        Queue<Cell> q=new LinkedList<>();
        q.add(new Cell(1,0,0));
        int[] row={-1,-1,0,1,1,1,0,-1};
        int[] col={0,1,1,1,0,-1,-1,-1};
        while(!q.isEmpty()){
            Cell curr=q.remove();
            int dist=curr.d;
            int r=curr.r;
            int c=curr.c;
            if(r == n-1 && c == n-1)return dist;
            for(int i=0; i<8; i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nc>=0 && nr<n && nc<n && grid[nr][nc]==0 && dist+1<distance[nr][nc]){
                    distance[nr][nc] = dist+1;
                    q.add(new Cell(dist+1,nr,nc));
                }
            }
        }
        return -1;
    }
}