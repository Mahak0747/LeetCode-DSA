class Solution {
    public int longestContinuousSubstring(String s) {
        int max=Integer.MIN_VALUE;
        String check="abcdefghijklmnopqrstuvwxyz";
        String str="";
        for(char ch:s.toCharArray()){
            str+=""+ch;
            if(check.contains(str))max=Math.max(max,str.length());
            else str=""+ch;
        }
        return max;
    }
}