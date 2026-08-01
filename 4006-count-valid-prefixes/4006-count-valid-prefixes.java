class Solution {
    public int countValidPrefixes(String s) {
        int c=0;
        int z=0;
        int o=0;
        for(char ch:s.toCharArray()){
            if(ch=='0')z++;
            else o++;
            if(Math.abs(z-o)<=1)c++;
        }
        return c;
    }
}