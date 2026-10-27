class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans=new String[m];
        StringBuilder sb =new StringBuilder();
        int idx=0;
        for(int i=0; i<n; i++)sb.append('.');
        ans[idx]=sb.toString();
        idx++;
        for(int i=0; i<m-1; i++){
            sb=new StringBuilder();
            for(int j=0; j<n-1; j++)sb.append('#');
            sb.append('.');
            ans[idx]=sb.toString();
            idx++;
        }
        return ans;
    }
}