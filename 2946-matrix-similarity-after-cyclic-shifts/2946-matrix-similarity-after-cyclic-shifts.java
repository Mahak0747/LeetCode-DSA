class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;        
        k = k % n; 
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int idx;
                if (i % 2 == 0)idx = (j + k) % n;
                else idx = (j - k + n) % n;
                if (mat[i][j] != mat[i][idx]) return false;
            }
        }
        return true;
    }
}