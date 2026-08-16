class Solution {
    public int maximumGap(String skill, String station) {
        int n=skill.length();
        int m=station.length();
        int[] e=new int[n];
        int[] l=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            while(station.charAt(j)!=skill.charAt(i))j++;            
            e[i]=j;
            j++;
        }
        j=m-1;
        for (int i = n - 1; i >= 0; i--) {
            while (station.charAt(j) != skill.charAt(i))j--;
            l[i]=j;
            j--;
        } 
        int ans=0;
        for(int i=1; i<n; i++){
            ans=Math.max(ans,l[i]-e[i-1]);
        }
        return ans;
    }
}