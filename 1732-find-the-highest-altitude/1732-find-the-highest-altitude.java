class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] alt=new int[n+1];
        int l=alt[0];
        for(int i=0; i<n; i++){
            alt[i+1]=gain[i]+alt[i];
        }
        for(int i=1; i<alt.length; i++){
            l=Math.max(l,alt[i]);
        }
        return l;
    }
}