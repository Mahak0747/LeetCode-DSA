class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int mod = 12345;
        int n = grid.length;
        int m = grid[0].length;
        int size = n * m;
        int[] arr = new int[size];
        int idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[idx++] = grid[i][j] % mod;
            }
        }
        int[] p = new int[size];
        int[] s = new int[size];
        p[0] = 1;
        for(int i=1;i<size;i++){
            p[i] = (p[i-1] * arr[i-1]) % mod;
        }
        s[size-1] = 1;
        for(int i=size-2;i>=0;i--){
            s[i] = (s[i+1] * arr[i+1]) % mod;
        }
        int[][] ans = new int[n][m];
        idx = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = (p[idx] * s[idx]) % mod;
                idx++;
            }
        }
        return ans;
    }
}