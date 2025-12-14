class Solution {
    public int numberOfWays(String corridor) {
        final int MOD = 1_000_000_007;

        int s=0;
        for (char c : corridor.toCharArray()) {
            if (c == 'S') s++;
        }
        if (s == 0 || s % 2 != 0) return 0;
        long ans=1;
        int sgone = 0;
        int p = 0;
        for (char c : corridor.toCharArray()) {
            if (c == 'S') {
                sgone++;
                if (sgone > 2 && sgone % 2 == 1) {
                    ans = (ans * (p + 1))% MOD; ;
                    p = 0;
                }
            } else if (sgone > 0 && sgone % 2 == 0) {
                p++;
            }
        }
        return (int)ans;
    }
}