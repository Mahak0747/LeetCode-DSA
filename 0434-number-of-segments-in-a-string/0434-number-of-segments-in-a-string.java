class Solution {
    public int countSegments(String s) {
        String[] words=s.split(" ");
        int c=0;
        for (String word : words) {
            if (!word.isEmpty()) {
                c++;
            }
        }
        return c;
    }
}