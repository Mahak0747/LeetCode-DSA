class Solution {
    private static void dfs(int r,int c,int val, int color, int[][] ans, int[][] image, int[] row, int[] col){
        ans[r][c]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0; i<4; i++){
            int nrow=r+row[i];
            int ncol=c+col[i];
            if(nrow>=0 && ncol>=0 && nrow<n && ncol<m && image[nrow][ncol]==val && ans[nrow][ncol]!=color){
                dfs(nrow,ncol,val,color,ans,image,row,col);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] ans=image;
        int val=image[sr][sc];
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        dfs(sr,sc,val,color,ans,image,row,col);
        return ans;
    }
}