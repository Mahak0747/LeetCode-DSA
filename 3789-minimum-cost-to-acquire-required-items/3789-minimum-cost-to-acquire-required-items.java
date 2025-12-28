class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
        long ans = 0;
        int common = Math.min(need1, need2);
        if (costBoth < cost1 + cost2) {
            ans += (long) common * costBoth;
            need1 -= common;
            need2 -= common;
        }
        if (need1 > 0) {
            if (costBoth < cost1) {
                ans += (long) need1 * costBoth;
            } else {
                ans += (long) need1 * cost1;
            }
        }
        if (need2 > 0) {
            if (costBoth < cost2) {
                ans += (long) need2 * costBoth;
            } else {
                ans += (long) need2 * cost2;
            }
        }
        return ans;
    }
}
