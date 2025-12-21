class Solution {

    private static void merge(int[] arr, int l, int mid, int r, int[] temp) {
        int idx = l;
        int S = l;
        int E = mid + 1;
        while (S <= mid && E <= r) {
            if (arr[S] <= arr[E]) {
                temp[idx++] = arr[S++];
            } else {
                temp[idx++] = arr[E++];
            }
        }

        while (S <= mid) temp[idx++] = arr[S++];
        while (E <= r) temp[idx++] = arr[E++];

        for (int i = l; i <= r; i++) arr[i] = temp[i];
    }

    private static int countPairs(int[] arr, int l, int mid, int r){
        int count=0;
        int j=mid+1;
        for(int i=l; i<=mid; i++){
            while(j<=r && (long)arr[i]>2*(long)arr[j]){
                j++;
            }
            count+=j-(mid+1);
        }
        return count;
    }

    private static int mergeSort(int[] arr, int l, int r,int[] temp) {
        int ct=0;//count here
        if (l >= r) return ct;
        int mid = l + (r - l) / 2;
        ct+=mergeSort(arr, l, mid,temp);
        ct+=mergeSort(arr, mid + 1, r,temp);
        ct+=countPairs(arr, l, mid, r);
        // Optimization: skip merge if already sorted
        if (arr[mid] <= arr[mid + 1]) return ct;

        merge(arr, l, mid, r, temp);
        return ct;
    }
    public int reversePairs(int[] arr) {
        int[] temp = new int[arr.length];
        return mergeSort(arr, 0, arr.length - 1,temp);
    }
}