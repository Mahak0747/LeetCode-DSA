class Solution {
    public int characterReplacement(String s, int k) {
        int max=0;
        int maxFreq=0;
        int l=0;
        int r=0;
        int[] freq=new int[26];
        while(r<s.length()){
            char ch=s.charAt(r);
            freq[ch-'A']++;
            maxFreq=Math.max(maxFreq,freq[ch-'A']);
            if(r-l+1-maxFreq>k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}