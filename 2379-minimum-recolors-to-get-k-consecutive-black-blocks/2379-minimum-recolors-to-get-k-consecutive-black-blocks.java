class Solution {
    public int minimumRecolors(String s, int k) {
        int min=s.length();
        for(int l=0; l<=s.length()-k; l++){
            int b=0;
            for(int r=l; r<l+k; r++){
                if(s.charAt(r)=='W')b++;
            }
            min=Math.min(min,b);
        }
        return min;
    }
}