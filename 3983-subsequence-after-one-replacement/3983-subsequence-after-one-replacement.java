class Solution {
    public boolean canMakeSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[] p=new int[n];
        int[] S=new int[n];
        int j=0;
        for(int i=0; i<n; i++){
            while(j<m && s.charAt(i)!=t.charAt(j))j++;
            if(j==m)p[i]=m;
            else p[i]=j++;
        }
        if(p[n-1]<m)return true;
        j=m-1;
        for(int i=n-1; i>=0; i--){
            while(j>0 && s.charAt(i)!=t.charAt(j))j--;
            if(j<0)S[i]=-1;
            else S[i]=j--;
        }
        for(int i=0; i<n; i++){
            int l=(i==0)?-1:p[i-1];
            int r=(i==n-1)?m:S[i+1];
            if(l<r-1)return true;
        }
        return false;
    }
}