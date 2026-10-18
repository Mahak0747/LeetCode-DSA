class Solution {
    private static boolean next(char a, char b){
        return (a=='R'&&b=='B')||(a=='B'&&b=='W')||(a=='W'&&b=='R');
    }
    public int findColoredRoot(int[][] edges, String colors) {
        int n=colors.length();
        int[] in=new int[n];
        int[] out=new int[n];
        for(int[] i:edges){
            int u=i[0];
            int v=i[1];
            if(next(colors.charAt(u),colors.charAt(v))){
                out[u]++;
                in[v]++;
            }
            else if(next(colors.charAt(v),colors.charAt(u))){
                out[v]++;
                in[u]++;
            }
            else return -1;
        }
        int ans=-1;
        for(int i=0; i<n; i++){
            if(out[i]>2 || in[i]>1)return -1;
            if(in[i]==0){
                if(ans!=-1)return -1;
                ans=i;
            }
        }
        return ans;
    }
}