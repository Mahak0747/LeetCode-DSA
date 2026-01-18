class Solution {
    public int vowelConsonantScore(String s) {
        String vowels="aeiou";
        int v=0;
        int c=0;
        for(int i=0; i<s.length(); i++){
            char ch=s.charAt(i);
            if(vowels.indexOf(ch) != -1)v++;
            else if(ch >= 'a' && ch <= 'z')c++;
        }
        return c>0?v/c:0;
    }
}