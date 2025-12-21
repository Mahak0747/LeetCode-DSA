class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        for(int i=0; i<accounts.length; i++){
            int k=0;
            for(int j=0; j<accounts[0].length; j++){
                k+=accounts[i][j];
            }
            m=Math.max(k,m);
        }
        return m;
    }
}