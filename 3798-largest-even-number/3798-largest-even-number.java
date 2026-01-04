class Solution {
    public String largestEven(String s) {
        int lastTwo = s.lastIndexOf('2');
        if (lastTwo == -1) {
            return "";
        }
        return s.substring(0, lastTwo + 1);
    }
}