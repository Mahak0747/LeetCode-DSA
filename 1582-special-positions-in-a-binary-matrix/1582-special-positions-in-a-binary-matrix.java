class Solution {
    private static boolean check(int[][] mat,int x,int z){
        for(int i=0; i<mat.length; i++){
            if(i==x)continue;
            if(mat[i][z]==1)return false;
        }
        for(int j=0; j<mat[0].length; j++){
            if(j==z)continue;
            if(mat[x][j]==1)return false;
        }
        return true;
    }
    public int numSpecial(int[][] mat) {
        int ans=0;
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat[0].length; j++){
                if(mat[i][j]==1 && check(mat,i,j))ans++;
            }
        }
        return ans;
    }
}