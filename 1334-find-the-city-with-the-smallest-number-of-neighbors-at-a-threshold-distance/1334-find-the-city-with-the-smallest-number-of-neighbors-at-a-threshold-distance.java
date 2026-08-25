class Solution {
    public int findTheCity(int n, int[][] edges, int distanceThreshold) {
        int[][] mat=new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(mat[i], 10001); 
            mat[i][i] = 0;
        }
        for(int[] i:edges){
            mat[i[0]][i[1]]=i[2];
            mat[i[1]][i[0]]=i[2];
        }
        for(int mask=0; mask<n; mask++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    mat[i][j]=Math.min(mat[i][j],mat[i][mask]+mat[mask][j]);
                }
            }
        }
        int min=Integer.MAX_VALUE;
        int city=-1;
        for(int i=0; i<n; i++){
            int c=0;
            for(int j=0; j<n; j++){
                if(mat[i][j]<=distanceThreshold)c++;
            }
            if(c<=min){
                min=c;
                city=i;
            }
        }
        return city;
    }
}