class Solution {
    public int[][] generateMatrix(int n) {
        int[][] mat = new int[n][n];
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int k = 1;
        while (left <= right && top <= bottom){
            for(int col=left; col<=right; col++){
                mat[top][col]=k++;
            }
            top++;
            for(int row=top; row<=bottom; row++){
                mat[row][right]=k++;
            }
            right--;
            for(int col=right; col>=left; col--){
                mat[bottom][col]=k++;
            }
            bottom--;
            for(int row=bottom; row>=top; row--){
                mat[row][left]=k++;
            }
            left++;
        }
        return mat;
    }
}