class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        int[][] mat=new int[n][2];
        for(int i=0; i<n; i++){
            mat[i][0]=i;
            mat[i][1]=score[i];
        }
        Arrays.sort(mat,Comparator.comparingDouble(o->o[1]));
        String[] ans=new String[n];
        for(int i=0; i<n; i++){
            if (i == n-1)ans[mat[i][0]] = "Gold Medal";
            else if (i == n-2)ans[mat[i][0]] = "Silver Medal";
            else if (i == n-3)ans[mat[i][0]] = "Bronze Medal";
            else ans[mat[i][0]] = String.valueOf(n-i);
        }
        return ans;
    }
}