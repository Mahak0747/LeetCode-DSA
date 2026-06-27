class Solution {
    public int minimumRecolors(String s, int k) {
        int min=s.length();
        int l=0; 
        int r=0;
        int w=0;
        while(r<s.length()){
            if(s.charAt(r)=='W')w++;
            if(r-l+1>k){
                if(s.charAt(l)=='W')w--;
                l++;
            }
            if(r-l+1==k)min=Math.min(min,w);
            r++;
        }
        return min;
    }
}