class Solution {
    public int lengthOfLastWord(String s) {
        String[] arr = s.split(" ");   
        String t=arr[arr.length-1];
        return t.length();
    }
}