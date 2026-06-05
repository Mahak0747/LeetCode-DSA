class Solution {
    public boolean isAdjacentDiffAtMostTwo(String s) {
        for(int i=0; i<s.length()-1; i++){
            int ch1=s.charAt(i)-'0';
            int ch2=s.charAt(i+1)-'0';
            if(Math.abs(ch1-ch2)>2)return false;
        }
        return true;
    }
}