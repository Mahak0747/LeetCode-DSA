class Solution {
    public int minRotations(int n, String s) {
        int curr=0;
        int base = 0;
        for(char ch:s.toCharArray()){
            int dig=ch-'0';
            int diff=Math.abs(curr-dig);
            int rot=Math.min(diff,10-diff);
            base+=rot;
            curr=dig;
        }
        int ans=base;
        int last = s.charAt(n - 1) - '0';
        for(int i=0; i<n; i++){
            int l;
            if(i==0)l=0;
            else l= s.charAt(i - 1) - '0';
            int u=s.charAt(i) - '0';
            int oldDiff=Math.abs(l-u);
            int oldCost=Math.min(oldDiff,10-oldDiff);
            int newDiff=Math.abs(l-last);
            int newCost=Math.min(newDiff,10-newDiff);
            int total=base-oldCost+newCost;
            ans=Math.min(ans,total);
        }
        return ans;
    }
}