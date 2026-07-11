class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int n=mat.length;
        int m=mat[0].length;
        if (n * m != r * c)return mat;
        int[][] ans=new int[r][c];
        int row=0;
        int col=0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(col==m){
                    row++;
                    col=0;
                }
                ans[i][j]=mat[row][col];
                col++;
            }
        }
        return ans;
    }
}