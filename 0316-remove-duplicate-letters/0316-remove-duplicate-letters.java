class Solution {
    public String removeDuplicateLetters(String s) {
        int[] freq=new int[26];
        for(char ch:s.toCharArray())freq[ch-'a']++;
        StringBuilder sb=new StringBuilder();
        boolean[] used = new boolean[26];
        for(char ch : s.toCharArray()){
            freq[ch - 'a']--;
            if(used[ch - 'a']) continue;
            while(sb.length() > 0 &&sb.charAt(sb.length() - 1) > ch &&freq[sb.charAt(sb.length() - 1) - 'a'] > 0) {
            used[sb.charAt(sb.length() - 1) - 'a'] = false;
            sb.deleteCharAt(sb.length() - 1);
            }
            sb.append(ch);
            used[ch - 'a'] = true;
        }
        return sb.toString();
    }
}