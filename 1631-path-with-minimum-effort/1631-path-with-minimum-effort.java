class Cell implements Comparable<Cell>{
    int diff;
    int r;
    int c;
    public Cell(int d, int r, int c){
        this.diff=d;
        this.r=r;
        this.c=c;
    }
    @Override
    public int compareTo(Cell other){
        return this.diff-other.diff;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n=heights.length;
        int m=heights[0].length;
        int[][] difference=new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++)difference[i][j]=Integer.MAX_VALUE;
        }
        difference[0][0]=0;
        PriorityQueue<Cell> q=new PriorityQueue<>();
        q.add(new Cell(0,0,0));
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        while(!q.isEmpty()){
            Cell curr=q.remove();
            int diff=curr.diff;
            int r=curr.r;
            int c=curr.c;
            if(r==n-1 && c==m-1)return diff;
            for(int i=0; i<4; i++){
                int nr=r+row[i];
                int nc=c+col[i];
                if(nr>=0 && nc>=0 && nr<n && nc<m){
                    int effort=Math.max(Math.abs(heights[nr][nc]-heights[r][c]),diff);
                    if(effort<difference[nr][nc]){
                        difference[nr][nc]=effort;
                        q.add(new Cell(effort,nr,nc));
                    }
                }
            }
        }
        return 0;
    }
}