class DSU{
    int[] parent;
    public DSU(int n){
        parent=new int[n];
        for(int i=0; i<n; i++)parent[i]=i;
    }
    public int findParent(int a){
        if(parent[a]==a)return a;
        parent[a]=findParent(parent[a]);
        return parent[a];
    }
    public void unionOfSets(int a,int b){
        int pa=findParent(a);
        int pb=findParent(b);
        if(pa==pb)return;
        parent[pb]=pa;
    }
}
class Solution {
    public int makeConnected(int n, int[][] connections) {
        DSU ds=new DSU(n);
        int extra=0;
        for(int i=0; i<connections.length; i++){
            int u=connections[i][0];
            int v=connections[i][1];
            if(ds.findParent(u)==ds.findParent(v))extra++;
            else ds.unionOfSets(u,v);
        }
        int c=0;
        for(int i=0; i<n; i++){
            if(ds.findParent(i) == i)c++;
        }
        int ans=c-1;
        if(extra>=ans)return ans;
        return -1;
    }
}