class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> a = new ArrayList<>();
        for (int x : nums) a.add(x);
        int ans = 0;
        while (true) {
            boolean sorted = true;
            for (int i = 1; i < a.size(); i++) {
                if (a.get(i) < a.get(i - 1)) {
                    sorted = false;
                    break;
                }
            }
            if (sorted) break;
            int minSum = Integer.MAX_VALUE;
            int idx = 0;
            for (int i = 0; i + 1 < a.size(); i++) {
                int sum = a.get(i) + a.get(i + 1);
                if (sum < minSum) {
                    minSum = sum;
                    idx = i;
                }
            }
            a.set(idx, minSum);
            a.remove(idx + 1);
            ans++;
        }
        return ans;
    }
}
