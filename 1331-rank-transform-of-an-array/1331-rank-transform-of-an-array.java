class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[][] mat=new int[arr.length][2];
        for(int i=0; i<arr.length; i++){
            mat[i][0]=arr[i];
            mat[i][1]=i;
        }
        Arrays.sort(mat,(a, b) -> Integer.compare(a[0], b[0]));
        int r=1;
        int[] ans=new int[arr.length];
        for(int i=0; i<mat.length; i++){
            if (i > 0 && mat[i - 1][0] == mat[i][0]) {
                ans[mat[i][1]] = r - 1;
            } 
            else {
                ans[mat[i][1]] = r;
                r++;
            }
        }
        return ans;
    }
}