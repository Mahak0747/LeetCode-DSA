class Solution {
    public int minFlips(String s) {
        int n = s.length();
        if (n < 3) return 0;
        int cnt0 = 0;
        for (int i = 0; i < n; i++)
            if (s.charAt(i) == '0')
                cnt0++;
        int cnt1 = n - cnt0;
        int res1 = cnt0;
        int res2 = Math.max(cnt1 - 1, 0);
        int res3 = cnt1 - (s.charAt(0) - '0') - (s.charAt(n - 1) - '0');
        return Math.min(res1, Math.min(res2, res3));
    }
}