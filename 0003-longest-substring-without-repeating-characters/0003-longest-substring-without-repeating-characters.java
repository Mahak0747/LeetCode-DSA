class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength=-1;
        String str="";
        for(int i=0; i<s.length(); i++){
            if(!str.contains(s.charAt(i)+"")){
                str+=s.charAt(i);
            }
            else{
                maxLength=Math.max(maxLength,str.length());
                int idx = str.indexOf(s.charAt(i));
                str = str.substring(idx + 1);
                str += s.charAt(i);
            }
        }
        maxLength = Math.max(maxLength, str.length());
        return maxLength;
    }
}