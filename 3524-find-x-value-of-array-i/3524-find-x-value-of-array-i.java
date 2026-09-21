class Solution {
    public long[] resultArray(int[] A, int k) {
        long[] res = new long[k];
        int[] fre = new int[k];
        for (int i : A) {
            i %= k;
            int[] curr = new int[k];
            curr[i] = 1;
            for (int x = 0; x < k; x++)
                curr[x * i % k] += fre[x];
            fre = curr;
            for (int x = 0; x < k; x++)
                res[x] += fre[x];
        }
        return res;
    }
}