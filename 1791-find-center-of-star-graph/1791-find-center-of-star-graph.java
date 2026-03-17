class Solution {
    public int findCenter(int[][] edges) {
        int n=edges.length+1;
        int[] dfs = new int[n + 1];
        for (int[] t : edges) {
            dfs[t[0]]++; 
            dfs[t[1]]++; 
        }        
        for (int i = 1; i <= n; i++) {
            if (dfs[i] == n - 1) return i;
        }
        return -1;
    }
}