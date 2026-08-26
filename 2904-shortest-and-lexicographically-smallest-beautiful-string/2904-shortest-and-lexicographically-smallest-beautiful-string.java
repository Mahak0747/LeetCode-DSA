class Solution {

    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        for (int mask = k; mask <= n; mask++) {
            String ans = "";
            for (int i = mask; i <= n; i++) {
                String ss = s.substring(i - mask, i);
                int c = 0;
                for (int j = 0; j < ss.length(); j++) {
                    c += ss.charAt(j) - '0';
                }
                if ((ans.isEmpty() || ss.compareTo(ans) < 0) && c == k) {
                    ans = ss;
                }
            }
            if (!ans.isEmpty()) {
                return ans;
            }
        }
        return "";
    }
}