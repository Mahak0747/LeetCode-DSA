class Solution {
    public List<String> generateValidStrings(int n, int p) {
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0; i<(1<<n); i++){
            StringBuilder sb=new StringBuilder();
            for(int j=n-1; j>=0; j--)sb.append(((i>>j)&1));
            String s=sb.toString();
            boolean is=true;
            int c=0;
            for(int k=0; k<n; k++){
                if(s.charAt(k)=='1'){
                    c+=k;
                    if(k>0 && s.charAt(k-1)=='1'){
                        is=false;
                        break;
                    }
                }
            }
            if(is && c<=p)ans.add(s);
        }
        return ans;
    }
}