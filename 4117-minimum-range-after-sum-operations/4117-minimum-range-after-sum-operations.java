class Solution {
    public int minRange(int a, int b, int c) {
        int[] arr={a,b,c};
        Arrays.sort(arr);
        a=arr[0];
        b=arr[1];
        c=arr[2];
        return Math.min(c-a,b);
    }
}