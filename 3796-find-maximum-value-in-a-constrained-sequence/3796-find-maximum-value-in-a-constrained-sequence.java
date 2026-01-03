class Solution {
    public int findMaxVal(int n, int[][] restrictions, int[] diff) {
         Map<Integer, Integer> cap = new HashMap<>();
        for (int[] r : restrictions) {
            cap.put(r[0], r[1]);
        }
        long[] maxAt = new long[n];
        maxAt[0] = 0;
        for (int i = 1; i < n; i++) {
            maxAt[i] = maxAt[i - 1] + diff[i - 1];
            if (cap.containsKey(i)) {
                maxAt[i] = Math.min(maxAt[i], cap.get(i));
            }
        }
        for (int i = n - 2; i >= 0; i--) {
            maxAt[i] = Math.min(maxAt[i], maxAt[i + 1] + diff[i]);
        }
        int ans = 0;
        for (long v : maxAt) {
            ans = (int) Math.max(ans, v);
        }
        return ans;
    }
}