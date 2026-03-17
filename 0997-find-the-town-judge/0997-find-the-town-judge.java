class Solution {
    public int findJudge(int n, int[][] trust) {
        int m = trust.length;
        boolean[]a = new boolean[n];
        int[]cnt = new int[n];
        for(int i = 0;i<m;i++){
            a[trust[i][0]-1]=true;
            cnt[trust[i][1]-1]++;
        }
        int ans = -1;
        for(int i = 0;i<n;i++){
            if(!a[i] && cnt[i]==n-1){
                ans=i+1;
                break;
            }
        }
        return ans;

    }
}