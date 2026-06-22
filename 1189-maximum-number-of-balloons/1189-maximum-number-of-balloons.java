class Solution {
    public int maxNumberOfBalloons(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())freq[ch-'a']++;
        freq[11]/=2;
        freq[14]/=2;
        int min=Integer.MAX_VALUE;
        min=Math.min(freq[0],Math.min(freq[1],Math.min(freq[11],Math.min(freq[14],freq[13]))));
        return min;
    }
}