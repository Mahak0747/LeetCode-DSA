class Solution {
    public int minRotations(String s) {
        int curr=0;
        int ans=0;
        for(char ch:s.toCharArray()){
            int dig=ch-'0';
            int diff=Math.abs(curr-dig);
            int rot=Math.min(diff,10-diff);
            ans+=rot;
            curr=dig;
        }
        return ans;
    }
}