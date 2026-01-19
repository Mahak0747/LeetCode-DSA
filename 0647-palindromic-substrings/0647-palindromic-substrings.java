class Solution {
    private boolean check(String s,int l,int u){
        while(l<=u){
            if(s.charAt(l)!=s.charAt(u))return false;
            l++;
            u--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {   
                if(check(s,i,j))ans++;
            }
        }
        return ans;
    }
}