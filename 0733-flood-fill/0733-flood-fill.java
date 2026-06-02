class Pair{
    int f;
    int s;
    public Pair(int f, int s){
        this.f=f;
        this.s=s;
    }
}
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        if (val == color) return image;
        int m=image.length;
        int n=image[0].length;
        boolean[][] seen=new boolean[m][n];
        Queue<Pair> q=new LinkedList<Pair>();
        q.add(new Pair(sr,sc));
        seen[sr][sc]=true;
        int[] row={-1,1,0,0};
        int[] col={0,0,-1,1};
        while(!q.isEmpty()){
            int r=q.peek().f;
            int c=q.peek().s;
            q.remove();
            image[r][c]=color;
            for (int k = 0; k < 4; k++){
                int nr=r+row[k];
                int nc=c+col[k];
                if(nr>=0 && nc>=0 && nr<m && nc<n && image[nr][nc]==val && !seen[nr][nc]){
                    seen[nr][nc]=true;
                    q.add(new Pair(nr,nc));
                }
            }
        }
        return image;
    }
}