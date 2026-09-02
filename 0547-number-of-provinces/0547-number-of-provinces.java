class DisjointSet{
    int[] parent;
    public DisjointSet(int n){
        parent=new int[n];
        for(int i=0; i<n; i++){
            parent[i]=i;
        }
    }
    public int findParent(int a){
        if (parent[a] == a) {
            return a;
        }
        return parent[a] = findParent(parent[a]);
    }
    public void unionOfSets(int a,int b){
        int pa = findParent(a);
        int pb = findParent(b);
        if (pa == pb) {
            return;
        }
        parent[pb] = pa;
    }
}
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        DisjointSet ds=new DisjointSet(n);
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(isConnected[i][j]==1)ds.unionOfSets(i,j);
            }
        }
        int c=0;
        for(int i=0; i<n; i++){
            if(ds.parent[i]==i)c++;
        }
        return c;
    }
}