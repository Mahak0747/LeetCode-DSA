class Solution {
    public int mirrorFrequency(String s) {
        int[] letters = new int[26];
        int[] digits = new int[10];
        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a']++;
            } else {
                digits[ch - '0']++;
            }
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            int j = 25 - i;
            if (i > j) continue;

            sum += Math.abs(letters[i] - letters[j]);
        }
        for (int i = 0; i < 10; i++) {
            int j = 9 - i; 
            if (i > j) continue;
            sum += Math.abs(digits[i] - digits[j]);
        }
        return sum;
    }
}