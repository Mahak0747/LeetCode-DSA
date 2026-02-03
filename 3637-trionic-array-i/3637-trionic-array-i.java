class Solution {
    public boolean isTrionic(int[] arr) {
        int n=arr.length;
        if(n<4)return false;
        int i=0;
        while(i+1<n&&arr[i]<arr[i+1]){
            i++;
        }
        if (i == 0 || i == n - 1) return false;
        int next=i;
        while(i+1<n&&arr[i]>arr[i+1]){
            i++;
        }
        if (i == 0 || i == n - 1) return false;
        while(i+1<n&&arr[i]<arr[i+1]){
            i++;
        }
        return i==n-1;
    }
}