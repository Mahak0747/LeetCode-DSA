class Solution {
    private static int maxEl(int[][] arr,int r,int mid){
        int max=-1;
        int idx=-1;
        for(int i=0; i<r; i++){
            if(max<arr[i][mid]){
                max=arr[i][mid];
                idx=i;
            }
        }
        return idx;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int l=0;
        int u=n-1;
        while(l<=u){
            int mid=l+(u-l)/2;
            int max=maxEl(mat,m,mid);
            int left=mid-1>=0? mat[max][mid-1]:1;
            int right=mid+1<n? mat[max][mid+1]:1;
            if(mat[max][mid]>left && mat[max][mid]>right)return new int[]{max,mid};
            else if(mat[max][mid]<left)u=mid-1;
            else l=mid+1;
        }
        return new int[]{-1,-1};
    }
}