class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int n=0;
        long s=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                if(matrix[i][j]<0) n++;
                min=Math.min(min,Math.abs(matrix[i][j]));
                s+=Math.abs(matrix[i][j]);
            }
        }if(n%2!=0){
            s-=(2*min);
        }return s;
    }
}