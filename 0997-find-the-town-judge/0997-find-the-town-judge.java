class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] dfs = new int[n + 1];
        for (int[] t : trust) {
            dfs[t[0]]--; 
            dfs[t[1]]++; 
        }        
        for (int i = 1; i <= n; i++) {
            if (dfs[i] == n - 1) return i;
        }
        return -1;
    }
}