class Solution {
    public int maxScore(String s) {
        int O = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') O++;
        }
        int Z = 0;
        int max = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                Z++;
            } else {
                O--;
            }
            max = Math.max(max, Z+O);
        }
        return max;
    }
}
