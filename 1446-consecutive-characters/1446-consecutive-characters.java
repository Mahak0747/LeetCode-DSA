class Solution {
    public int maxPower(String s) {
        char curr=s.charAt(0);
        int c=1;
        int max=1;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=curr){
                max=Math.max(max,c);
                curr=s.charAt(i);
                c=0;
            }
            c++;
        }
        max=Math.max(max,c);
        return max;
    }
}