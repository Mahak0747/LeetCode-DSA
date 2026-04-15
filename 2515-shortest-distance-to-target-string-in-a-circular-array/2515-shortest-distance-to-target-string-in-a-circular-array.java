class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (words[i].equals(target)) {
                int c = (i - startIndex + n) % n;
                int a = (startIndex - i + n) % n;
                ans = Math.min(ans, Math.min(c, a));
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}