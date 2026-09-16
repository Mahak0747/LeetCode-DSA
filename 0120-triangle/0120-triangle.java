class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int[] dp=new int[n];
        for(int j=0; j<n; j++)dp[j]=triangle.get(n-1).get(j);
        for(int i=n-2; i>=0; i--){
            for(int j = 0; j <= i; j++){
                int d=triangle.get(i).get(j)+dp[j];
                int di=triangle.get(i).get(j)+dp[j+1];
                dp[j]=Math.min(d,di);
            }
        }
        return dp[0];
    }
}