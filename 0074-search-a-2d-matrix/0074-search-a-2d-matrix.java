class Solution {
    public boolean searchMatrix(int[][] arr, int key) {
        int m = arr.length;
        int n = arr[0].length;
        int l=0;
        int u=m*n-1;
        while(l<=u){
            int mid=l+(u-l)/2;
            int r=mid/n;
            int c=mid%n;
            if(arr[r][c]==key)return true;
            else if(arr[r][c]<key){
                l=mid+1;
            }
            else{
                u=mid-1;
            }
        }
        return false;
    }
}