class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> lower = new HashSet<>();
        HashSet<Character> upper = new HashSet<>();
        for (char ch : word.toCharArray()) {
            if (Character.isLowerCase(ch)) lower.add(ch);
            else upper.add(ch);
        }
        int c = 0;
        for (char ch : lower) {
            if (upper.contains(Character.toUpperCase(ch))) {
                c++;
            }
        }
        return c;
    }
}