class Solution {
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {   
                String sub = s.substring(i, j);
                StringBuilder sb = new StringBuilder(sub);
                if (sub.equals(sb.reverse().toString())) {
                    ans++;
                }
            }
        }
        return ans;
    }
}